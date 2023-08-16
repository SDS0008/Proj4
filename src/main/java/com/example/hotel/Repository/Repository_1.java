package com.example.hotel.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.example.hotel.Entity.Entity1;

@Component
public interface Repository_1 extends JpaRepository<Entity1, Integer> {

}
