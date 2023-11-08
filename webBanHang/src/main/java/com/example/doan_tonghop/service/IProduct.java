package com.example.doan_tonghop.service;

import com.example.doan_tonghop.dto.ProducTypeDTO;
import com.example.doan_tonghop.dto.ProductDTO;

import java.util.List;

public interface IProduct {
    List<ProductDTO> findAll();
    List<ProductDTO> findByProductTypeID(Long productTypeId);
    ProductDTO add(ProductDTO productDTO);
    ProductDTO update(ProductDTO productDTO);
    void delete(ProductDTO productDTO);
    ProductDTO getOne(Long id);
}
