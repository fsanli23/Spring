package com.sanli.repository;

import com.sanli.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepository  extends JpaRepository<Cart,Long> {
}
