package dev.simpleapp.twitter.security.mapper;

import dev.simpleapp.twitter.security.model.UserAccount;
import dev.simpleapp.twitter.security.web.model.RegisterRequest;
import jakarta.validation.constraints.NotNull;

public class UserAccountMapper {

    //static final String DATE_TIME_FORMAT = "dd-MM-yyyy HH:mm";

    public static RegisterRequest toDto(@NotNull UserAccount userAccount) {
        return RegisterRequest.builder()
                .username(userAccount.getUsername())
                .password(userAccount.getPassword())
                .build();
    }

//    public static UserAccount fromDto(@NotNull RegisterRequest registerRequest) {
//        return UserAccount.builder()
//                .username(userAccount.getUsername())
//                .password(userAccount.getPassword())
//                .build();
//    }


//
//    public static void updateUserFromDto(@NotNull User user, @NotNull UserDTO userDTO) {
//        user.setState(userDTO.state());
//        user.setEmail(userDTO.email());
//        user.setPassword(userDTO.password());
//        user.setDateCreated(LocalDateTime.parse(userDTO.dateCreated(), DateTimeFormatter.ofPattern(DATE_TIME_FORMAT)));
//        user.setRoles(userDTO.roles());
//    }
}
