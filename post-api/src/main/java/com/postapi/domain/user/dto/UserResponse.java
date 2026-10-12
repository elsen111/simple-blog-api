package com.postapi.domain.user.dto;

import com.postapi.domain.user.entity.UserRole;

import java.time.LocalDateTime;
import java.util.UUID;

public record UserResponse(

        UUID id,
        String username,
        String email,
        UserRole role,
        boolean enabled,
        LocalDateTime createdAt,
        LocalDateTime updatedAt

) {
}