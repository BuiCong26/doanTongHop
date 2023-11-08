package com.example.doan_tonghop.controller;



import com.example.doan_tonghop.dto.ProducTypeDTO;
import com.example.doan_tonghop.dto.ProductDTO;
import com.example.doan_tonghop.service.impl.ProductService;
import com.example.doan_tonghop.service.impl.ProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class ProductController {
    @Autowired
    private ProductService productService;


    @GetMapping("/create")
    public String viewproduct()
    {
        return "createproduct";
    }
    @PostMapping("/create")
    public ProductDTO create(@RequestBody ProductDTO model)

    {
        return productService.add(model);
    }
}
