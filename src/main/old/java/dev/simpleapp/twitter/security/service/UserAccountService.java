package dev.simpleapp.twitter.security.service;

import dev.simpleapp.twitter.security.model.UserAccount;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.validation.annotation.Validated;

import java.util.Optional;

public interface UserAccountService {
    void createUserAccount(UserAccount userAccount);

    Optional<UserDetails> findUserByUsername(String username);
}
