package guru.springframework.controllers;

import guru.springframework.services.JokesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {

    @Autowired
    JokesService jokesService;

    @RequestMapping
    String getJoke(Model model) {
        model.addAttribute("joke", jokesService.getJoke());
        return "chuckNorris";
    }
}
