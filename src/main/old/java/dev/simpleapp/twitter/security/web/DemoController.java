package dev.simpleapp.twitter.security.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@Slf4j
@RestController
@RequestMapping("/api/v1/demo")
public class DemoController {
    @GetMapping("/just-auth")
    public String hitJustAuthEndPoint() {
        return "This is protected resource";
    }

    @GetMapping("/just-role-user")
    public String hitJustRoleUserEndPoint() {
        return "This is protected resource";
    }

    @GetMapping("/just-role-admin")
    public String hitJustRoleAdminEndPoint(Principal principal) {
        log.debug("Principal {}", principal);
        return "This is protected resource";
    }
}
