package com.example.doan_tonghop.controller;

import com.example.doan_tonghop.entity.ImageTableEntity;
import com.example.doan_tonghop.entity.SaveImageEntity;
import com.example.doan_tonghop.repository.ImageRepository;
import com.example.doan_tonghop.repository.UploadsRepository;
import com.example.doan_tonghop.service.impl.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@RestController
public class UploadController {
    private static final Path CURRENT_FOLDER = Paths.get(System.getProperty("user.dir"));

    @Autowired
    private UploadsRepository uploadsRepository;

    @PostMapping("/")
    @ResponseStatus(HttpStatus.CREATED)
    public SaveImageEntity create(@RequestParam("image") MultipartFile image) throws IOException {
        Path staticPath = Paths.get("static");
        Path imagePath = Paths.get("image");
        if (!Files.exists(CURRENT_FOLDER.resolve(staticPath).resolve(imagePath))) {
            Files.createDirectories(CURRENT_FOLDER.resolve(staticPath).resolve(imagePath));
        }
        Path file = CURRENT_FOLDER.resolve(staticPath)
                .resolve(imagePath).resolve(image.getOriginalFilename());
        try (OutputStream os = Files.newOutputStream(file)) {
            os.write(image.getBytes());
        }
        SaveImageEntity saveImageEntity = new SaveImageEntity();
        saveImageEntity.setImageUrl(imagePath.resolve(image.getOriginalFilename()).toString());
        return uploadsRepository.save(saveImageEntity);
    }
}
