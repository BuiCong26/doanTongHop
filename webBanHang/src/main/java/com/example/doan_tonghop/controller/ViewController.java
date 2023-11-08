package com.example.doan_tonghop.controller;

import com.example.doan_tonghop.service.impl.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ViewController {
    @Autowired
    private ProductService productService;

    @GetMapping("/")
    public String show(Model model)
    {
        model.addAttribute("products",productService.findAll());
        return "home";
    }

}
