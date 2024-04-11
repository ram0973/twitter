package dev.simpleapp.twitter.security.repository;

import dev.simpleapp.twitter.security.model.UserAccount;
import dev.simpleapp.twitter.security.model.UserRole;
import jakarta.validation.constraints.NotNull;
import lombok.NonNull;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRoleRepository extends JpaRepository<UserRole, Long> {
    @Override
    @NonNull
    Optional<UserRole> findById(@NonNull Long aLong);
    Optional<UserRole> findByAuthority(@NonNull String authority);
}
