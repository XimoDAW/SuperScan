package com.superscann.SuperScann.mapper;

import com.superscann.SuperScann.controller.model.UserWeb;
import com.superscann.SuperScann.domain.model.User;
import com.superscann.SuperScann.persistance.model.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface UserMapper {

    User toDomain(UserEntity entity);
    UserEntity toEntity(User domain);
    UserWeb toUserWeb(User domain);
}
