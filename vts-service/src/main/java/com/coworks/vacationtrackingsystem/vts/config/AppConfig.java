package com.coworks.vacationtrackingsystem.vts.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public ModelMapper modelMapper() {
        ModelMapper modelMapper = new ModelMapper();
        /*
        MatchingStrategies.STRICT in ModelMapper ensures that property names between source and destination
        objects must exactly match for the mapping to occur.
         */
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        return modelMapper;
    }
    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI()
                .info(new Info().title("VTS")
                        .description("VTS documentation.")
                        .version("v1.0"));
    }

    //webclient -> for reactive and non-reactive
}
