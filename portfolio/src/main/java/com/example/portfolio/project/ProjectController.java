package com.example.portfolio.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class ProjectController {

    private final ProjectService projectService;

    @Autowired
    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @GetMapping("/")
    public String showView(Model model) {
        return "entry_sign";
    }

    @PostMapping("/portfolios")
    public String projekts_show(){
        return "portfolio_side";
    }

    // Python
    @PostMapping("/portfolios/python_projekte")
    public String python_show(){
        return "python_index";
    }

    @PostMapping("/portfolios/analyst")
    public String python_analyst_show(){
        return "python_spotify";
    }

    @PostMapping("/portfolios/food")
    public String python_food_show(){
        return "python_food";
    }

    @PostMapping("/portfolios/allgemein")
    public String python_allgemein_show(){
        return "python_allgemein";
    }

    // Hamster
    @PostMapping("/portfolios/hamster_projekte")
    public String hamster_show(){
        return "hamster_index";
    }

    @PostMapping("/portfolios/hamster1")
    public String hamster1(){
        return "hamster1";
    }

    @PostMapping("/portfolios/hamster2")
    public String hamster2(){
        return "hamster2";
    }
    @PostMapping("/portfolios/hamster3")
    public String hamster3(){
        return "hamster3";
    }
}
