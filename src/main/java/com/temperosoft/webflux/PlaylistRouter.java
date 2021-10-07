package com.temperosoft.webflux;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.POST;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;

import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

//@Configuration
public class PlaylistRouter {

	@Bean
	public RouterFunction<ServerResponse> route(PlaylistHandler handler) {
		return RouterFunctions
				.route(GET("/playlist").and(accept(MediaType.APPLICATION_JSON)), handler::findAll)
				.andRoute(GET("/playlist/{id}").and(accept(MediaType.APPLICATION_JSON)), handler::findById)
				.andRoute(POST("/playlist").and(accept(MediaType.APPLICATION_JSON)), handler::save);
	}
	
}
