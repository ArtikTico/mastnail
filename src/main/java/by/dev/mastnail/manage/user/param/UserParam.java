package by.dev.mastnail.manage.user.param;

import javax.validation.constraints.NotNull;

public class UserParam {
    @NotNull
    private Long id;

    @NotNull
    private String firstName;

    @NotNull
    private String lastName;

    @NotNull
    private String username;

    @NotNull
    private String password;
}
