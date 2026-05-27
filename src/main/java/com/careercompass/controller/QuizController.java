package com.careercompass.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class QuizController {

    // Open Quiz Page
    @GetMapping("/quiz")
    public String showQuizPage() {
        return "quiz";
    }

    // Submit Quiz
    @PostMapping("/submitQuiz")
    public String submitQuiz(
            @RequestParam String q1,
            @RequestParam String q2,
            @RequestParam String q3,
            @RequestParam String q4,
            @RequestParam String q5,
            Model model) {

        String career = "";
        String description = "";

        // Software Engineering
        if(q1.equals("coding") || q5.equals("software")) {

            career = "Software Engineer";

            description = "You enjoy coding and problem solving. "
                    + "A Software Engineer develops websites, applications, "
                    + "and software systems using programming languages.";

        }

        // Graphic Designer
        else if(q1.equals("design") || q5.equals("graphics")) {

            career = "Graphic Designer";

            description = "You are creative and interested in visuals. "
                    + "Graphic Designers create logos, UI designs, "
                    + "social media graphics, and branding materials.";

        }

        // Data Analyst
        else {

            career = "Data Analyst";

            description = "You love data and logical thinking. "
                    + "Data Analysts collect and analyze data to help "
                    + "companies make better business decisions.";
        }

        model.addAttribute("career", career);
        model.addAttribute("description", description);

        return "result";
    }
}