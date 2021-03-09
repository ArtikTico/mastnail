package by.dev.mastnail.util;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapperConfig extends ModelMapper {

    @Bean
    public static ModelMapper getMapper() {
        return new ModelMapper();
    }
}
