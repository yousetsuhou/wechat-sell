package com.yousetsuhou.service;

import com.yousetsuhou.dataobject.ProductCategory;
import org.hibernate.validator.constraints.EAN;

import java.util.List;

public interface CategoryService {
    ProductCategory findOne(Integer categoryId);
    List<ProductCategory> findAll();
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
    ProductCategory save(ProductCategory productCategory);
}
