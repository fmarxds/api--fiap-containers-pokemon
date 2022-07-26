package com.fiap.containers.pokemon.apifiapcontainerspokemon.controller;

import com.fiap.containers.pokemon.apifiapcontainerspokemon.model.PokemonTeamModel;
import com.fiap.containers.pokemon.apifiapcontainerspokemon.service.PokemonTeamService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/api/pokemon/team")
@RequiredArgsConstructor
public class PokemonTeamController {

    private final PokemonTeamService pokemonTeamService;

    @GetMapping
    public ResponseEntity<Collection<PokemonTeamModel>> getAll() {
        return ResponseEntity.ok(pokemonTeamService.findAllTeams());
    }

    @GetMapping("/{id}")
    public ResponseEntity<PokemonTeamModel> getById(@PathVariable("id") String id) {
        return ResponseEntity.of(pokemonTeamService.findOneById(id));
    }

    @PostMapping
    public ResponseEntity<PokemonTeamModel> save(@RequestBody PokemonTeamModel pokemonTeamModel) {
        return new ResponseEntity<>(pokemonTeamService.saveOne(pokemonTeamModel), HttpStatus.CREATED);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<PokemonTeamModel> update(
            @PathVariable("id") String id,
            @RequestBody PokemonTeamModel pokemonTeamModel) {
        return ResponseEntity.ok(pokemonTeamService.updateOneById(id, pokemonTeamModel));
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable("id") String id) {
        pokemonTeamService.deleteOneById(id);
    }

}
