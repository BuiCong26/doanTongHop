package com.example.doan_tonghop.repository;

import com.example.doan_tonghop.entity.ImageTableEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImageRepository extends JpaRepository<ImageTableEntity, Long> {
}
