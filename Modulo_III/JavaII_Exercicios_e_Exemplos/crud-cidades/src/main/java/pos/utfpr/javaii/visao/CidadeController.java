package pos.utfpr.javaii.visao;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Set;

@Controller
public class CidadeController {
    @GetMapping("/")
    public String listar(Model memoria) {
        var cidade = Set.of(
          new Cidade("Cornélio Procópio", "PR"),
          new Cidade("Assis", "SP"),
          new Cidade("Itajaí", "SC")
        );
        memoria.addAttribute("listaCidades", cidade);
        return "/crud";
    }
}
