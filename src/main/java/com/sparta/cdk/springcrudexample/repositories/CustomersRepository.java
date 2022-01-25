package com.sparta.cdk.springcrudexample.repositories;

import com.sparta.cdk.springcrudexample.entities.CustomersEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomersRepository extends JpaRepository<CustomersEntity, String> {

}
