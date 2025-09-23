package com.superscann.SuperScann.domain.service.impl;

import com.superscann.SuperScann.domain.model.Market;
import com.superscann.SuperScann.domain.repository.MarketRepository;
import com.superscann.SuperScann.domain.service.MarketService;
import com.superscann.SuperScann.mapper.MarketMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MarketServiceImpl implements MarketService {
    @Autowired
    MarketRepository marketRepository;
    @Autowired
    MarketMapper marketMapper;
    @Override
    public Market findById(int id) {
        return marketMapper.toDomain(marketRepository.findById(id));
    }
}
