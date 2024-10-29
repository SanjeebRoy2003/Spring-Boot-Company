package springboot.mapping.SpringBoot_Company.Configuration;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class modelmapper {
    @Bean
    ModelMapper getModelMapper(){
        return new ModelMapper();
    }
}
