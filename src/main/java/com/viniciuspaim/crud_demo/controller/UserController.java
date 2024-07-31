package com.viniciuspaim.crud_demo.controller;

import com.viniciuspaim.crud_demo.dto.UserDTO;
import com.viniciuspaim.crud_demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/registration")
    public String getRegistrationPage(@ModelAttribute("user") UserDTO userDTO) {
        return "register";
    }

    @PostMapping("/registration")
    public String saveUser(@ModelAttribute("user") UserDTO userDTO, Model model) {
        userService.save(userDTO);
        model.addAttribute("message", "Registered Successfully!");
        return "register";
    }
}
