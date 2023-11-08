package com.example.doan_tonghop.repository;

import com.example.doan_tonghop.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Long> {
  @Query("select p from ProductEntity p where p.productType_Id = ?1")
  List<ProductEntity> findByProductType_Id(Long productTypeId);
}
