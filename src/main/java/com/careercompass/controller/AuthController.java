package com.careercompass.controller;

import com.careercompass.model.User;
import com.careercompass.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import jakarta.servlet.http.HttpSession;

@Controller
public class AuthController {

    @Autowired
    private UserRepository userRepository;

    // ================= REGISTER =================

    // Open Register Page
    @GetMapping("/register")
    public String showRegisterPage() {
        return "register";
    }

    // Save User
    @PostMapping("/register")
    public String registerUser(@ModelAttribute User user) {

        userRepository.save(user);

        return "redirect:/login";
    }

    // ================= LOGIN =================

    // Open Login Page
    @GetMapping("/login")
    public String showLoginPage() {
        return "login";
    }

    // Login User
    @PostMapping("/login")
    public String loginUser(@RequestParam String email,
                            @RequestParam String password) {

        User user = userRepository.findByEmail(email);

        if (user != null && user.getPassword().equals(password)) {

            return "dashboard";

        } else {

            return "login";
        }
    }

    // ================= DASHBOARD =================

    @GetMapping("/dashboard")
    public String dashboard() {
        return "dashboard";
    }
    @GetMapping("/logout")
    public String logout(HttpSession session) {

        session.invalidate();

        return "redirect:/login";
    }

}