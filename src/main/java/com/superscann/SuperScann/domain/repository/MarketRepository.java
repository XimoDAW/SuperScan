package com.superscann.SuperScann.domain.repository;

import com.superscann.SuperScann.persistance.model.MarketEntity;
import com.superscann.SuperScann.persistance.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MarketRepository extends JpaRepository<MarketEntity, Long> {
    MarketEntity findById(int id);
}
