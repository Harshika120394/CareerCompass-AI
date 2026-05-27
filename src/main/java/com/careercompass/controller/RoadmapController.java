package com.careercompass.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class RoadmapController {

    @GetMapping("/roadmap")
    public String showRoadmap(@RequestParam("career") String career,
                              Model model) {

        List<String> roadmap = new ArrayList<>();

        // Software Developer Roadmap
        if(career.equals("Software Developer")) {

            roadmap.add("Learn Java Fundamentals");
            roadmap.add("Understand Object-Oriented Programming");
            roadmap.add("Learn SQL & Database Management");
            roadmap.add("Master Spring Boot Framework");
            roadmap.add("Build Real-Time Projects");
            roadmap.add("Learn Git & GitHub");
            roadmap.add("Prepare Data Structures & Algorithms");

        }

        // UI/UX Designer Roadmap
        else if(career.equals("UI/UX Designer")) {

            roadmap.add("Learn Design Principles");
            roadmap.add("Master Figma or Adobe XD");
            roadmap.add("Understand User Experience");
            roadmap.add("Create Wireframes & Prototypes");
            roadmap.add("Learn Color Theory & Typography");
            roadmap.add("Build Portfolio Projects");

        }

        // Data Analyst Roadmap
        else {

            roadmap.add("Learn Microsoft Excel");
            roadmap.add("Learn SQL Queries");
            roadmap.add("Learn Python for Data Analysis");
            roadmap.add("Master Power BI or Tableau");
            roadmap.add("Understand Data Visualization");
            roadmap.add("Work on Real Data Projects");

        }

        model.addAttribute("career", career);
        model.addAttribute("roadmap", roadmap);

        return "roadmap";
    }
}