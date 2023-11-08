package com.example.doan_tonghop.controller;

import com.example.doan_tonghop.entity.ImageTableEntity;
import com.example.doan_tonghop.repository.ImageRepository;
import com.example.doan_tonghop.service.impl.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@RestController
public class ImageController {
    private static final Path CURRENT_FOLDER = Paths.get(System.getProperty("user.dir"));

    @Autowired
    private ImageService imageService;
    @Autowired
    private ImageRepository imageRepository;
    @PostMapping("/home")
    public ImageTableEntity uploadImage(@RequestParam("image")MultipartFile image) throws IOException {
        Path staticPath = Paths.get("static");
        Path imagePath = Paths.get("images");
        if (!Files.exists(CURRENT_FOLDER.resolve(staticPath).resolve(imagePath))) {
            Files.createDirectories(CURRENT_FOLDER.resolve(staticPath).resolve(imagePath));
        }
        Path file = CURRENT_FOLDER.resolve(staticPath)
                .resolve(imagePath).resolve(image.getOriginalFilename());
        try (OutputStream os = Files.newOutputStream(file)) {
            os.write(image.getBytes());
        }

            ImageTableEntity imageTableEntity = new ImageTableEntity();
            imageTableEntity.setImageUrl(imagePath.resolve(image.getOriginalFilename()).toString());
            return imageRepository.save(imageTableEntity);
    }
}
