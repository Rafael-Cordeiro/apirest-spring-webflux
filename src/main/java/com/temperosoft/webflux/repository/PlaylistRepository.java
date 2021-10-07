package com.temperosoft.webflux.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.temperosoft.webflux.document.Playlist;

public interface PlaylistRepository extends ReactiveMongoRepository<Playlist, String> {

}
