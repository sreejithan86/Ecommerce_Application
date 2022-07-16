package com.code.ecommerce.dao;

import com.code.ecommerce.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@RepositoryRestResource(collectionResourceRel = "productcategory", path="product-category")
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {
}
