package com.log.LogisticsSpring.Controllers;

import com.log.LogisticsSpring.Models.User;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String getIndex(Model model) {
        model.addAttribute("user", new User());
        model.addAttribute("name", "Customer");
        return "index";
    }

    @PostMapping("/")
    public String login(Model model, User user){
        String name = user.getUsername();
        model.addAttribute("name", name);
        model.addAttribute("user", user);
        return "result";
    }

}
