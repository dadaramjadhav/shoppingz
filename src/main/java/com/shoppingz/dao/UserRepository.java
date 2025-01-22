package com.shoppingz.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.shoppingz.entity.UserDtls;

@Repository
public interface UserRepository extends JpaRepository<UserDtls, Integer> {

}
