package com.example.doan_tonghop.repository;

import com.example.doan_tonghop.entity.ProductTypeEntity;
import com.mysql.cj.log.Log;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductTypeRepository extends JpaRepository<ProductTypeEntity,Long> {
}
