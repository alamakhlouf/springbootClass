package tn.esprit.spring.springboot1alinfo.Configuration;


import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenAPIConfig {
    @Bean
    public OpenAPI springShopOpenAPI() {
        return new OpenAPI().info(infoAPI());

    }

    public Info infoAPI() {
        return new Info().title("SpringDoc-Demo")
                .description("TP étude de cas")
                .contact(contactAPI());
    }

    public Contact contactAPI() {
        Contact contact = new Contact().name("Equipe ASI II")
                .email("*************@esprit.tn")
                .url("https://www.linkedin.com/in/**********/");
        return contact;
    }
    @Bean
    public GroupedOpenApi pistePublicApi() {
        return GroupedOpenApi.builder()
                .group("Only Piste Management API")
                                .pathsToMatch("/piste/**")
                                .pathsToExclude("**")
                                .build();
    }
    @Bean
    public GroupedOpenApi skieurPublicApi() {
        return GroupedOpenApi.builder()
                .group("Only Skieur Management API")
                .pathsToMatch("/skieur/**")
                .pathsToExclude("**")
                .build();
    }
}