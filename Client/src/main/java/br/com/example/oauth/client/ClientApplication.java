package br.com.example.oauth.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by zozfabio on 04/12/2015.
 */
@SpringBootApplication
public class ClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(ClientApplication.class, args);
    }
}

@RestController
@RequestMapping("/")
class MainController {
    @RequestMapping
    private String home() {
        return "Hello World!!!";
    }
}

@Configuration
@EnableOAuth2Sso
class SecurityConfiguration {
}
