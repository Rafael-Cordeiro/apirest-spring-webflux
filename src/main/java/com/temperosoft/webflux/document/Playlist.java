package com.temperosoft.webflux.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Document
@Getter
@Setter
public class Playlist {
		
	@Id
	private String id;
	private String nome;
	
}
