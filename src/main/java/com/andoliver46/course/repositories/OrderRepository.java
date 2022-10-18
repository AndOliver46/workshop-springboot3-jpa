package com.andoliver46.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andoliver46.course.entities.Order;

//Não precisa da annotation @Repository pois já herdou da classe extendida JpaRepository
public interface OrderRepository extends JpaRepository<Order,Long>{
}
