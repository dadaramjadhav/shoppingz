package com.shoppingz.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shoppingz.entity.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer>{

}
