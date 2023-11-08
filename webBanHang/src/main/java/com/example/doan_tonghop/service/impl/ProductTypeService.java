package com.example.doan_tonghop.service.impl;

import com.example.doan_tonghop.dto.ProducTypeDTO;
import com.example.doan_tonghop.dto.ProductDTO;
import com.example.doan_tonghop.entity.ProductEntity;
import com.example.doan_tonghop.entity.ProductTypeEntity;
import com.example.doan_tonghop.repository.ProductTypeRepository;
import com.example.doan_tonghop.service.IProducType;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductTypeService implements IProducType{
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private ProductTypeRepository productTypeRepository;
    //Convert
    public ProductTypeEntity toEntity (ProducTypeDTO producTypeDTO)
    {
        ProductTypeEntity productTypeEntity = new ProductTypeEntity();
        productTypeEntity = modelMapper.map(producTypeDTO,ProductTypeEntity.class);
        return productTypeEntity;
    }
    public ProducTypeDTO toDTO (ProductTypeEntity productTypeEntity)
    {
        ProducTypeDTO producTypeDTO = new ProducTypeDTO();
        producTypeDTO = modelMapper.map(productTypeEntity,ProducTypeDTO.class);
        return producTypeDTO;
    }
    @Override
    public List<ProducTypeDTO> findAll() {
        List<ProducTypeDTO> results = new ArrayList<>();
        List<ProductTypeEntity> productTypeEntities = productTypeRepository.findAll();
        for (ProductTypeEntity item : productTypeEntities)
        {
            ProducTypeDTO producTypeDTO = toDTO(item);
            results.add(producTypeDTO);
        }
        return results;
    }

}
