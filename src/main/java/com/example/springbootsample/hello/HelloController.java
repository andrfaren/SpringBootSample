package com.example.springbootsample.hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String getHello() {
        // Screen transition to hello.html
        return "hello";
    }

    @PostMapping("/hello")
    public String postRequest(@RequestParam("text1") String str, Model model) {
        // Register the string received from the screen to Model
        model.addAttribute("sample", str);

        // Screen transition to response.html
        return "hello/response";
    }
}
