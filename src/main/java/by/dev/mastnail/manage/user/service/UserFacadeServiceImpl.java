package by.dev.mastnail.manage.user.service;

import by.dev.mastnail.manage.user.model.User;
import by.dev.mastnail.manage.user.param.UserParam;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
@Validated
@Component
@RequiredArgsConstructor
@Slf4j
public class UserFacadeServiceImpl implements UserFacadeService {

    private final UserService userService;

    @Override
    @NotNull
    @Transactional
    public User registerUser(@Valid @NotNull UserParam userParam) {
        return userService.registerUser(userParam);
    }
}
