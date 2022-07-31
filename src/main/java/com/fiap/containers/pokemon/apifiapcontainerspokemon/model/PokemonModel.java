package com.fiap.containers.pokemon.apifiapcontainerspokemon.model;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class PokemonModel {

    @EqualsAndHashCode.Include
    private String name;

}
