package com.app.api_gateway;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;

@Configuration
@EnableWebFluxSecurity
public class SecurityConfig {

	@Bean
	public SecurityWebFilterChain securityWebFilterchain(ServerHttpSecurity serverhttpsecurity) {
		  serverhttpsecurity.csrf().disable().
		  authorizeExchange(exchange->exchange.anyExchange().authenticated()).
		  oauth2ResourceServer(ServerHttpSecurity.OAuth2ResourceServerSpec::jwt);
				  
	return serverhttpsecurity.build();
	}
}
