package com.superscann.SuperScann.mapper;

import com.superscann.SuperScann.controller.model.MarketWeb;
import com.superscann.SuperScann.domain.model.Market;
import com.superscann.SuperScann.persistance.model.MarketEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")

public interface MarketMapper {
    Market toDomain(MarketEntity entity);
    MarketEntity toEntity(Market domain);
    MarketWeb toMarketWeb(Market domain);
}
