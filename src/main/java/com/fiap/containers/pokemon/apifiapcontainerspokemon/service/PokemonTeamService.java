package com.fiap.containers.pokemon.apifiapcontainerspokemon.service;

import com.fiap.containers.pokemon.apifiapcontainerspokemon.model.PokemonTeamModel;
import com.fiap.containers.pokemon.apifiapcontainerspokemon.repository.PokemonTeamRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PokemonTeamService {

    private final PokemonTeamRepository pokemonTeamRepository;

    public List<PokemonTeamModel> findAllTeams() {
        return pokemonTeamRepository.findAll();
    }

    public Optional<PokemonTeamModel> findOneById(String id) {
        return pokemonTeamRepository.findById(id);
    }

    public PokemonTeamModel saveOne(PokemonTeamModel pokemonTeamModel) {
        return pokemonTeamRepository.save(pokemonTeamModel);
    }

    public PokemonTeamModel updateOneById(String id, PokemonTeamModel pokemonTeamModel) {

        PokemonTeamModel pokemonTeamModelSaved = pokemonTeamRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Team ID not found"));

        pokemonTeamModelSaved.setPokemons(pokemonTeamModel.getPokemons());

        return pokemonTeamRepository.save(pokemonTeamModelSaved);

    }

    public void deleteOneById(String id) {
        pokemonTeamRepository.deleteById(id);
    }

}
