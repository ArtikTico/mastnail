package by.dev.mastnail.manage.user.web.controller.converter;

import by.dev.mastnail.manage.user.model.User;
import by.dev.mastnail.manage.user.web.controller.dto.UserResponse;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class UserWebConverter {

    private final ModelMapper modelMapper;

    public UserResponse toUserResponse(User user) {
        return modelMapper.map(user, UserResponse.class);
    }

}
