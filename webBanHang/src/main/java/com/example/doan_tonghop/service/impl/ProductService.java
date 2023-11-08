package com.example.doan_tonghop.service.impl;

import com.example.doan_tonghop.dto.ProducTypeDTO;
import com.example.doan_tonghop.entity.ProductEntity;
import com.example.doan_tonghop.dto.ProductDTO;
import com.example.doan_tonghop.entity.ProductTypeEntity;
import com.example.doan_tonghop.repository.ProductRepository;
import com.example.doan_tonghop.repository.ProductTypeRepository;
import com.example.doan_tonghop.service.IProduct;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ProductService implements IProduct {
    @Autowired
    private ProductRepository  productRepository;
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private ProductTypeRepository productTypeRepository;


    //Convert
    public ProductEntity toEntity (ProductDTO productDTO)
    {
        ProductEntity productEntity = new ProductEntity();
        productEntity = modelMapper.map(productDTO,ProductEntity.class);
        return productEntity;
    }
    public ProductDTO toDTO (ProductEntity productEntity)
    {
        ProductDTO productDTO = new ProductDTO();
        productDTO = modelMapper.map(productEntity,ProductDTO.class);
        return productDTO;
    }
    //Method
    @Override
    public List<ProductDTO> findAll() {
        List<ProductDTO> results = new ArrayList<>();
        List<ProductEntity> product = productRepository.findAll();
        for (ProductEntity item : product)
        {
            ProductDTO productDTO = toDTO(item);
            results.add(productDTO);
        }
        return results;
    }
    @Override
    public List<ProductDTO> findByProductTypeID(Long productTypeId) {
        List<ProductDTO> results = new ArrayList<>();
        List<ProductEntity> product = productRepository.findByProductType_Id(productTypeId);
        for (ProductEntity item : product)
        {
            ProductDTO productDTO = toDTO(item);
            results.add(productDTO);
        }
        return results;
    }

    @Override
    public ProductDTO add(ProductDTO productDTO) {
        ProductEntity productEntity = new ProductEntity();
        productEntity = toEntity(productDTO);
        productEntity = productRepository.save(productEntity);
        productDTO = toDTO(productEntity);
        return productDTO;

    }


    @Override
    public ProductDTO update(ProductDTO productDTO) {
        return null;
    }

    @Override
    public void delete(ProductDTO productDTO) {

    }

    @Override
    public ProductDTO getOne(Long id) {
        return null;
    }
}
