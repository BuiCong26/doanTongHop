package com.example.doan_tonghop.service.impl;

import com.example.doan_tonghop.entity.ImageTableEntity;
import com.example.doan_tonghop.dto.ImageDTO;
import com.example.doan_tonghop.repository.ImageRepository;
import com.example.doan_tonghop.service.IImage;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImageService implements IImage {
    @Autowired
    private ImageRepository imageRepository;
    @Autowired
    private ModelMapper modelMapper;

    //Convert
    public ImageTableEntity toEntity (ImageDTO imageDTO)
    {
        ImageTableEntity imageTableEntity = new ImageTableEntity();
        imageTableEntity = modelMapper.map(imageDTO,ImageTableEntity.class);
        return imageTableEntity;
    }
    public ImageDTO toDTO (ImageTableEntity imageTableEntity)
    {
        ImageDTO imageDTO = new ImageDTO();
        imageDTO = modelMapper.map(imageTableEntity,ImageDTO.class);
        return imageDTO;
    }
    @Override
    public ImageDTO save(ImageDTO imageDTO) {
        ImageTableEntity imageTableEntity = new ImageTableEntity();
        imageTableEntity = toEntity(imageDTO);
        imageTableEntity = imageRepository.save(imageTableEntity);
        imageDTO = toDTO(imageTableEntity);
        return imageDTO;
    }
}
