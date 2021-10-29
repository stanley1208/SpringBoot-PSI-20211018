package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Customer;
import com.example.demo.entity.Department;
import com.example.demo.entity.Employee;
import com.example.demo.entity.Order;
import com.example.demo.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

}