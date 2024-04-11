package dev.simpleapp.twitter.security.service.impl;

import dev.simpleapp.twitter.security.model.UserAccount;
import dev.simpleapp.twitter.security.repository.UserAccountRepository;
import dev.simpleapp.twitter.security.service.UserAccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserAccountServiceImpl implements UserAccountService {

    private final UserAccountRepository userAccountRepository;
    @Override
    public void createUserAccount(UserAccount userAccount) {
        boolean isUserAccountExists = this.userAccountRepository.existsByUsername(userAccount.getUsername());
        if (isUserAccountExists) {
            throw new RuntimeException("Account with username is already exists");
        }
        userAccountRepository.save(userAccount);
    }

    @Override
    public Optional<UserDetails> findUserByUsername(String username) {
        return Optional.ofNullable(this.userAccountRepository.findByUsername(username));
    }
}
