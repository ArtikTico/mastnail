package by.dev.mastnail.manage.user.web.controller;

import by.dev.mastnail.manage.user.repository.entity.UserEntity;
import by.dev.mastnail.manage.user.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    @PostMapping
    public UserEntity registerUser(@RequestBody UserEntity user) {
        var userEntity = userService.registerUser(user);
        return userEntity;
    }
}
