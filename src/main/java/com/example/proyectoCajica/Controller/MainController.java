package com.example.proyectoCajica.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class MainController {

    @GetMapping
    public ModelAndView index(Model model){
        model.addAttribute("nombreBack","ALCALDIA");
        return new ModelAndView("index.html");
    }
}
