package dev.simpleapp.twitter.security.web.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Builder;

public record RegisterRequest(
        @NotBlank
        @Email
        @Size(min = 2, max = 32)
        String username,
        @NotBlank
        @Size(min = 2, max = 128)
        String password) {

        @Builder
        public RegisterRequest {
        }
}
