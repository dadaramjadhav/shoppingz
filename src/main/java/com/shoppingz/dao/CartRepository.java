package com.shoppingz.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shoppingz.entity.Cart;

@Repository
public interface CartRepository extends JpaRepository<Cart, Integer>{

}
