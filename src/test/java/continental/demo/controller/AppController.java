package continental.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import continental.demo.model.Usuario;
import continental.demo.service.IAppService;

@Controller
public class AppController {

    @Autowired
    private IAppService appService;

    @GetMapping
    public String listarUsuarios(Model model) {
        List<Usuario> listarUsuarios = appService.listarUsuario();
        model.addAttribute("listaUsuarios", listarUsuarios);
        return "listaUsuarios";
    }

    @GetMapping("")
    public String index() {
        return "index";
    }
}
