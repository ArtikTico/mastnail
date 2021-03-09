package by.dev.mastnail.manage.user.service;

import by.dev.mastnail.manage.user.repository.UserRepository;
import by.dev.mastnail.manage.user.repository.entity.UserEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    @Transactional
    public UserEntity registerUser(UserEntity user) {
        return userRepository.save(user);
    }
}
