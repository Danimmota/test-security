package dev.danimota.testsecurity.config;

import lombok.Builder;

@Builder
public record JWTUserData(Long userId, String email) {
}
