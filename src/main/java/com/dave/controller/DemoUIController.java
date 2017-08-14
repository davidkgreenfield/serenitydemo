package com.dave.controller;

import com.dave.model.Favorites;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Slf4j
@Controller
public class DemoUIController {

    @GetMapping("/greeting")
    public String processIndex(@RequestParam(value="name") String name, Model model){
        model.addAttribute("name",name);
        model.addAttribute("favorites",new Favorites(name));
        return "greeting";
    }

    @PostMapping("/greeting")
    public String processFavorites(Model model, @ModelAttribute Favorites favorites){
        log.info(favorites.toString());
        model.addAttribute("name",favorites.getUserName());
        return("thankyou");
    }
}
