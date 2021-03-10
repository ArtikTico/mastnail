package by.dev.mastnail.manage.user.web.controller;

import by.dev.mastnail.manage.user.param.UserParam;
import by.dev.mastnail.manage.user.service.UserFacadeService;
import by.dev.mastnail.manage.user.web.controller.converter.UserWebConverter;
import by.dev.mastnail.manage.user.web.controller.dto.UserResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {
    private final UserFacadeService userFacadeService;
    private final UserWebConverter userWebConverter;

    @PostMapping
    public UserResponse registerUser(@RequestBody UserParam userParam) {
        var user = userFacadeService.registerUser(userParam);
        return userWebConverter.toUserResponse(user);
    }
}
