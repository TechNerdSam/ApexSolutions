package com.example.ApexSolutions;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebController {

    @GetMapping("/")
    public String index() {
        return "accueil";
    }

    @PostMapping("/submit-contact")
    public String handleContactForm(
            @RequestParam("name") String name,
            @RequestParam("email") String email,
            @RequestParam("subject") String subject,
            @RequestParam("message") String message) {
        
        System.out.println("--- Nouveau message reçu ---");
        System.out.println("Nom: " + name);
        System.out.println("Email: " + email);
        System.out.println("Sujet: " + subject);
        System.out.println("Message: " + message);
        System.out.println("---------------------------");
        
        return "redirect:/";
    }
}