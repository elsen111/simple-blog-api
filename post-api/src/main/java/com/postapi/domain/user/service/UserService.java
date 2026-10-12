package com.postapi.domain.user.service;

import com.postapi.domain.user.dto.UpdateUserRequest;
import com.postapi.domain.user.dto.UserResponse;

public interface UserService {

    UserResponse getCurrentUser();

    UserResponse updateCurrentUser(UpdateUserRequest request);

    void deleteCurrentUser();
}
