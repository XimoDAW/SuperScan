package com.superscann.SuperScann.domain.repository;

import com.superscann.SuperScann.persistance.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
    UserEntity findById(int id);
}
