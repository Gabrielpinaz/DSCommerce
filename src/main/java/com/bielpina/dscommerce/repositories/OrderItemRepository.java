 package com.bielpina.dscommerce.repositories;

import com.bielpina.dscommerce.entities.OrderItem;
import com.bielpina.dscommerce.entities.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;

 public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

 }
