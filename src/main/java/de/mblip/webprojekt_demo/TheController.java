package de.mblip.webprojekt_demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TheController {

    @GetMapping("/greeting")
    public String goodMorning() {
        return "hello_world"; // Entspricht hello_world.html
    }

    @GetMapping("/helloThymeleaf")
    public String helloThymeleaf() {
        return "hello_thymeleaf";
    }

    @GetMapping("/strings")
    public String strings(Model model) {
        String txt = "Some text"; // <p th:text="${text}" /> zeigt jetzt "Some text"
        model.addAttribute("text", txt); //Der String ist ein Key für eine Variable
        return "strings";
    }

}
