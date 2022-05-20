package com.example.appinvoice.repository;

import com.example.appinvoice.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {
    @Query(value = "select * from category c join product p on c.id = p.category_id where p.id = ?1", nativeQuery = true)
    Category findByProductId(Integer productId);
}
