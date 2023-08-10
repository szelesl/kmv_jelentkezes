package org.kmvon.kisokos.users;

import org.kmvon.kisokos.exceptions.ServiceInterruptionException;
import org.kmvon.kisokos.users.domain.UserDTO;
import org.kmvon.kisokos.users.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(path = "/all")
    public ResponseEntity<?> getAllUsers() {
        try {
            final List<UserDTO> users = userService.findAllUsers();
            return ResponseEntity.ok(users);
        } catch (ServiceInterruptionException e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }
}
