package pro.sky.java.recipes.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

    @GetMapping("/")
    public String startMessage() {
        return "Приложение запущено";
    }

    @GetMapping("/info")
    public String getInformation() {
        return "1. Student name: Askar; " +
                "2. Project name: recipes; " +
                "3. Project creation date: 27.02.2023; " +
                "4. Project description: Recipe website. ";
    }
}
