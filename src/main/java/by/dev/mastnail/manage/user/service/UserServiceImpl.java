package by.dev.mastnail.manage.user.service;

import by.dev.mastnail.manage.user.model.User;
import by.dev.mastnail.manage.user.param.UserParam;
import by.dev.mastnail.manage.user.repository.UserRepository;
import by.dev.mastnail.manage.user.repository.converter.UserRepositoryConverter;
import by.dev.mastnail.manage.user.repository.entity.UserEntity;
import by.dev.mastnail.manage.user.service.converter.UserParamConverter;
import by.dev.mastnail.manage.user.web.controller.converter.UserWebConverter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Service
@RequiredArgsConstructor
@Slf4j
@Validated
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserParamConverter userParamConverter;
    private final UserRepositoryConverter userRepositoryConverter;

    @Override
    @Transactional
    public User registerUser(@Valid @NotNull UserParam userParam) {
        var user = userParamConverter.toModel(userParam);
        var savedUser = userRepository.save(userRepositoryConverter.toEntity(user));
        return userRepositoryConverter.toModel(savedUser);
    }
}
