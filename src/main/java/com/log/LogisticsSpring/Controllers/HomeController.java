package com.log.LogisticsSpring.Controllers;

import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class HomeController {
    @GetMapping("/")
    public String greeting(@RequestParam(name="name", required=false,
            defaultValue="World") String name, Model model){
        model.addAttribute("name", name);
        return "index";
    }
}

