package com.bas.chatapplication;

import com.bas.chatapplication.auth.AuthenticationService;
import com.bas.chatapplication.auth.RegisterRequest;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import static com.bas.chatapplication.user.Role.*;

@SpringBootApplication
public class ChatApplication {

	public static void main(String[] args) {

		SpringApplication.run(ChatApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner (AuthenticationService service) {
		return args -> {
			var admin = RegisterRequest.builder()
					.firstname("Admin")
					.lastname("Admin")
					.email("admin@email.com")
					.password("password")
					.role(ADMIN)
					.build();
			System.out.println("Admin token: " + service.register(admin).getAccessToken());

			var manager = RegisterRequest.builder()
					.firstname("Manager")
					.lastname("Manager")
					.email("manager@email.com")
					.password("password")
					.role(MANAGER)
					.build();
			System.out.println("Manager token: " + service.register(manager).getAccessToken());

			var user = RegisterRequest.builder()
					.firstname("user")
					.lastname("user")
					.email("user@email.com")
					.password("password")
					.role(USER)
					.build();
			System.out.println("User token: " + service.register(user).getAccessToken());
		};
	}
}
