package by.dev.mastnail.manage.user.service.converter;

import by.dev.mastnail.manage.user.model.User;
import by.dev.mastnail.manage.user.param.UserParam;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import static by.dev.mastnail.util.MapperConfig.getMapper;

@Component
@RequiredArgsConstructor
public class UserParamConverter {


    public User toModel(UserParam userParam) {
        return getMapper().map(userParam, User.class);
    }

}
