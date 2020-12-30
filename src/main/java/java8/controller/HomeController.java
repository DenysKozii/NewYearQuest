package java8.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping(value = {"/home", "/"})
    public String home(Model model) {
        return "home";
    }
    @GetMapping(value = "/start")
    public String start(Model model) {
        return "start";
    }
}
