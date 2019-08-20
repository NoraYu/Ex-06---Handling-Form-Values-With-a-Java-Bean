package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Homecontroller {
    @GetMapping("/songform")
    public String FormPage(Model model){
    model.addAttribute("song",new Song());
    return "songform";
 }


    @PostMapping("/songform")
    public String loadFormPage(@ModelAttribute Song song, Model model){
        model.addAttribute("song",song);
        return "confirmsong";
 }

}
