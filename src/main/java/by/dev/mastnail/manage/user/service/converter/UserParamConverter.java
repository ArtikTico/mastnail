package by.dev.mastnail.manage.user.service.converter;

import by.dev.mastnail.manage.user.model.User;
import by.dev.mastnail.manage.user.param.UserParam;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserParamConverter {

    private final ModelMapper modelMapper;

    public User toModel(UserParam userParam) {
        return modelMapper.map(userParam, User.class);
    }

}
