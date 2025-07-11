package com.example.proyectoCajica.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfiguration {
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("PROYECTO CAJICA API")
                        .version("1.0")
                        .description("Documentación completa para el API del Proyecto Cajica")
                        .termsOfService("https://example.com/terms")
                        .contact(new Contact()
                                .name("Soporte API")
                                .email("edwinlondoño@ucundinamarca.edu.co")
                                .url("https://example.com/contact"))
                        .license(new License()
                                .name("Apache 2.0")
                                .url("https://springdoc.org")));
    }
}