package pos.utfpr.javaii.visao;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashSet;
import java.util.Set;

@Controller
public class CidadeController {
    private Set<Cidade> cidades;

    public CidadeController() {
        cidades = new HashSet<Cidade>();
    }

    @GetMapping("/")
    public String listar(Model memoria) {
        memoria.addAttribute("listaCidades", cidades);
        return "/crud";
    }
}
