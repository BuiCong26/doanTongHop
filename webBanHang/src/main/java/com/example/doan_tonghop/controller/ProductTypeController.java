package com.example.doan_tonghop.controller;

import com.example.doan_tonghop.dto.ProducTypeDTO;
import com.example.doan_tonghop.dto.ProductDTO;
import com.example.doan_tonghop.service.impl.ProductService;
import com.example.doan_tonghop.service.impl.ProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class ProductTypeController {
    @Autowired
    private ProductTypeService productTypeService;
    @Autowired
    private ProductService productService;
    @GetMapping("productType")
    public List<ProducTypeDTO> view()
    {
        return productTypeService.findAll();
    }
    @GetMapping ("producType/{id}")
    public List<ProductDTO> getProducts(@PathVariable Long id)
    {
        return productService.findByProductTypeID(id);
    }

}
