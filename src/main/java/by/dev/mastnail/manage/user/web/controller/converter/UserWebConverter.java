package by.dev.mastnail.manage.user.web.controller.converter;

import by.dev.mastnail.manage.user.model.User;
import by.dev.mastnail.manage.user.web.controller.dto.UserResponse;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Component;

import static by.dev.mastnail.util.MapperConfig.getMapper;

@RequiredArgsConstructor
@Component
public class UserWebConverter {

    public UserResponse toUserResponse(User user) {
        return getMapper().map(user, UserResponse.class);
    }

}
