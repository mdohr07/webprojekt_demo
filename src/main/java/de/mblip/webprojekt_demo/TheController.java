package de.mblip.webprojekt_demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TheController {

@GetMapping("/greeting")
    public String goodMorning() {
        return "hello_world"; // Entspricht hello_world.html
    }

    @GetMapping("/helloThymeleaf")
    public String helloThymeleaf() {
        return "hello_world_thymeleaf";
    }
}
