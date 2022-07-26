package com.fiap.containers.pokemon.apifiapcontainerspokemon.repository;

import com.fiap.containers.pokemon.apifiapcontainerspokemon.model.PokemonTeamModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PokemonTeamRepository extends MongoRepository<PokemonTeamModel, String> {
}
