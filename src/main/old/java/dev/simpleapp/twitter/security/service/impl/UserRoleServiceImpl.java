package dev.simpleapp.twitter.security.service.impl;

import dev.simpleapp.twitter.security.model.UserRole;
import dev.simpleapp.twitter.security.repository.UserRoleRepository;
import dev.simpleapp.twitter.security.service.UserAccountService;
import dev.simpleapp.twitter.security.service.UserRoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserRoleServiceImpl implements UserRoleService {
    private final UserRoleRepository userRoleRepository;
    public Optional<UserRole> findUserRole() {
        return this.userRoleRepository.findByAuthority("ROLE_USER");
    }
}
