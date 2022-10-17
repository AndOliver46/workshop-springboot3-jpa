package com.andoliver46.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.andoliver46.course.entities.User;

public interface UserRepository extends JpaRepository<User,Long>{
}
