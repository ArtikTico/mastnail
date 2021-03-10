package by.dev.mastnail.manage.user.repository.converter;

import by.dev.mastnail.manage.user.model.User;
import by.dev.mastnail.manage.user.repository.entity.UserEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import static by.dev.mastnail.util.MapperConfig.getMapper;
@Component
@RequiredArgsConstructor
public class UserRepositoryConverter {

    public User toModel (UserEntity userEntity) {
        return getMapper().map(userEntity, User.class);
    }

    public UserEntity toEntity (User user) {
        return getMapper().map(user, UserEntity.class);
    }
}
