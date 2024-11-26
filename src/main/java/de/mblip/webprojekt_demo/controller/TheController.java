package de.mblip.webprojekt_demo.controller;

import de.mblip.webprojekt_demo.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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

    /*
    org.springframework.ui.Model;
		Dieses Model wird von Spring Boot verwaltet, es wird automatisch an die View weiter gereicht.
		Dem Model können beliebige Datenobjekte zugefügt werden.
     */
    @GetMapping("/strings")
    public String strings(Model model) {
        String txt = "Some text"; // <p th:text="${text}" /> zeigt jetzt "Some text"
        model.addAttribute("text", txt); //Der String ist ein Key für eine Variable
        return "strings";
    }

    @GetMapping("/numbers")
    public String numbers (Model model) {
        int x = 4711;
        model.addAttribute("integer", x);

        double d = 66.6;
        model.addAttribute("float", d);
        return "numbers";
    }

    @GetMapping("/date")
    public String date(Model model) {
        model.addAttribute("date", new Date());
        model.addAttribute("localDate", LocalDate.now());
        model.addAttribute("localTime", LocalTime.now());
        model.addAttribute("localDatTime", LocalDate.now());
        return "date";
    }

    @GetMapping("/collections")
    public String collections(Model model) {
        // Array
        int[] intArray = { 1, 2, 3, 4 };
        model.addAttribute("intArray", intArray);

        // List
        List<Integer> integerList = new ArrayList<>();
        integerList.add(4);
        integerList.add(2);
        integerList.add(3);
        integerList.add(1);
        model.addAttribute("integerList", integerList);

        return "collections";
    }

    @GetMapping("/person")
    public String somePerson(Model model) {
        Person person = new Person("Ellen", "Ripley");
        person.setOfLegalAge(true);
        model.addAttribute("person", person);
        return "person";
    }

    @GetMapping("/persons")
    public String persons(Model model) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Mordin", "Solus"));
        personList.add(new Person("Cl4p", "tr4p"));
        personList.add(new Person("Garrus", "Vakarian"));
        personList.add(new Person("Liara", "T'Soni"));
        personList.add(new Person("Handsome", "Jack"));
        model.addAttribute("persons", personList);
        return "persons";
    }

    @GetMapping("/graphics")
    public String graphics() {
        return "graphics";
    }

}
