package by.dev.mastnail.manage.user.service;

import by.dev.mastnail.manage.user.repository.entity.UserEntity;

public interface UserService {

    UserEntity registerUser(UserEntity user);
}
