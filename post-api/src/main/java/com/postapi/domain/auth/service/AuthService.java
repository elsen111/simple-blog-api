package com.postapi.domain.auth.service;

import com.postapi.domain.auth.dto.AuthResponse;
import com.postapi.domain.auth.dto.LoginRequest;
import com.postapi.domain.auth.dto.RefreshTokenRequest;
import com.postapi.domain.auth.dto.RegisterRequest;

public interface AuthService {

    AuthResponse register(RegisterRequest request);

    AuthResponse login(LoginRequest request);

    AuthResponse refresh(RefreshTokenRequest request);

    void logout(RefreshTokenRequest request);


}
