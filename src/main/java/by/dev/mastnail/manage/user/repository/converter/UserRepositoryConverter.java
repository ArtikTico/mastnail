package by.dev.mastnail.manage.user.repository.converter;

import by.dev.mastnail.manage.user.model.User;
import by.dev.mastnail.manage.user.repository.entity.UserEntity;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserRepositoryConverter {

    private final ModelMapper modelMapper;
    public User toModel (UserEntity userEntity) {
        return modelMapper.map(userEntity, User.class);
    }

    public UserEntity toEntity (User user) {
        return modelMapper.map(user, UserEntity.class);
    }
}
