package com.postapi.domain.user.mapper;

import com.postapi.domain.user.dto.UserResponse;
import com.postapi.domain.user.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserResponse toResponse(User user);

}
