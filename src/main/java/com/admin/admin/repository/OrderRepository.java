package com.admin.admin.repository;

import com.admin.admin.model.Orderr;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Orderr, Long> {

}
