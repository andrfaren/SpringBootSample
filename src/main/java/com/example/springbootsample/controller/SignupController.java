package com.example.springbootsample.controller;

import com.example.springbootsample.application.service.UserApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Locale;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class SignupController {

    @Autowired
    private UserApplicationService userApplicationService;

    /** Display the user signup screen */
    @GetMapping("/signup")
    public String getSignup(Model model, Locale locale) {
        // Get gender
        Map<String, Integer> genderMap = userApplicationService.getGenderMap(locale);
        model.addAttribute("genderMap", genderMap);

        // Transition to user signup screen
        return "user/signup";
    }

    /** User signup process */
    @PostMapping("/signup")
    public String postSignup() {
        // Redirect to login screen
        return "redirect:/login";
    }
}
