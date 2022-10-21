package com.andoliver46.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andoliver46.course.entities.OrderItem;
import com.andoliver46.course.entities.pk.OrderItemPK;

//Não precisa da annotation @Repository pois já herdou da classe extendida JpaRepository
public interface OrderItemRepository extends JpaRepository<OrderItem,OrderItemPK>{
}
