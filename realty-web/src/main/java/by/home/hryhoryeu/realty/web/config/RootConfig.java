package by.home.hryhoryeu.realty.web.config;

import by.home.hryhoryeu.realty.security.SecurityConfig;
import by.home.hryhoryeu.realty.services.ServiceConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({SecurityConfig.class, ServiceConfig.class})
public class RootConfig{

	
}
