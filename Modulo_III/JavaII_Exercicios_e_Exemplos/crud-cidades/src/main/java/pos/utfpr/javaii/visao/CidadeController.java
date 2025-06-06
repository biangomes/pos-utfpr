package pos.utfpr.javaii.visao;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

@Controller
public class CidadeController {

    private Set<Cidade> cidades;
    private final CidadeRepository repository;

    public CidadeController(CidadeRepository repository) {
      cidades = new HashSet<>();
      this.repository = repository;
    }

    @GetMapping("/")
    public String listar(Model memoria) {
        memoria.addAttribute("listaCidades", repository
            .findAll()
            .stream()
            .map(cidade -> new Cidade(
                cidade.getNome(),
                cidade.getEstado()))
            .collect(Collectors.toList()));
        return "/crud";
    }

    @PostMapping("/criar")
    public String criar(@RequestBody @Valid Cidade cidade, BindingResult validacao, Model memoria) {

        if (validacao.hasErrors()) {
            validacao.getFieldErrors()
                .forEach(error -> System.out.println(
                    String.format("O atributo %s emitiu a seguinte mensagem %s",
                                  error.getField(),
                                  error.getDefaultMessage())
                ));
            memoria.addAttribute("listaCidades", cidades);
        } else {
            // cidades.add(cidade)
            var novaCidade = new CidadeEntidade();
            novaCidade.setNome(cidade.getNome());
            novaCidade.setEstado(cidade.getEstado());
            repository.save(novaCidade);
        }

        return "redirect:/";
    }

    @GetMapping("/excluir")
    public String excluir(@RequestParam String nome, @RequestParam String estado) {
        var cidadeEstadoEncontrada = repository.findByNomeAndEstado(nome, estado);
        cidadeEstadoEncontrada.ifPresent(repository::delete);

        return "redirect:/";
    }

    @GetMapping("/preparaAlterar")
    public String preparaAlterar(@RequestParam String nome, @RequestParam String estado, Model memoria) {
        var cidadeAtual = repository.findByNomeAndEstado(nome, estado);
        if (cidadeAtual.isPresent()) {
            memoria.addAttribute("cidadeAtual", cidadeAtual.get());
            memoria.addAttribute("listaCidades", cidades);
        }

        return "/crud";
    }

    @PostMapping("/alterar")
    public String alterar(
        @RequestParam String nomeAtual,
        @RequestParam String estadoAtual,
        Cidade cidade) {

        var cidadeAtual = repository.findByNomeAndEstado(nomeAtual, estadoAtual);

        if (cidadeAtual.isPresent()) {
            var cidadeEncontrada = cidadeAtual.get();
            cidadeEncontrada.setNome(cidade.getNome());
            cidadeEncontrada.setEstado(cidade.getEstado());
            repository.saveAndFlush(cidadeEncontrada);
        }

        return "redirect:/";
    }
}
