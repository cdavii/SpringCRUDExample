package com.sparta.cdk.springcrudexample.repositories;

import com.sparta.cdk.springcrudexample.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Integer> {
}
