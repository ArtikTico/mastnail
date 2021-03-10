package by.dev.mastnail.manage.user.service;

import by.dev.mastnail.manage.user.model.User;
import by.dev.mastnail.manage.user.param.UserParam;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

public interface UserFacadeService {
    @NotNull
    User registerUser(@Valid @NotNull UserParam userParam);
}
