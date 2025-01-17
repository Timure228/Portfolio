package com.example.portfolio.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDate;


import java.util.List;

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

}
