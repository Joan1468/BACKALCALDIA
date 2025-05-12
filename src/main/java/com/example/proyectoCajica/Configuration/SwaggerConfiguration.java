package com.example.proyectoCajica.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfiguration {
    @Bean
    public OpenAPI customOpenAPI(){
        return new OpenAPI()
                .info(new Info()
                        .title("PROYECTO CAJICA")
                        .version("1.0")
                        .description("Documentación Proyecto Cajica")
                        .contact(new Contact()
                                .name("Alejandro Londoño")
                                .email("edwinlondoño@ucundinamarca.edu.co")));
    }
}