 package com.bielpina.dscommerce.repositories;

import com.bielpina.dscommerce.entities.Order;
import com.bielpina.dscommerce.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
