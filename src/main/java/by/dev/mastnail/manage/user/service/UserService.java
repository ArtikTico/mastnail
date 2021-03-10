package by.dev.mastnail.manage.user.service;

import by.dev.mastnail.manage.user.model.User;
import by.dev.mastnail.manage.user.param.UserParam;

public interface UserService {

    User registerUser(UserParam userParam);
}
