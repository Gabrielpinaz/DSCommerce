package com.bielpina.dscommerce.repositories;

import com.bielpina.dscommerce.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);
}
