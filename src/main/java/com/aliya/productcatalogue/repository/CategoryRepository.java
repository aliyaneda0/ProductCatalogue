package com.aliya.productcatalogue.repository;

import com.aliya.productcatalogue.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {
}
