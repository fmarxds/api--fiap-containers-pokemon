package com.fiap.containers.pokemon.apifiapcontainerspokemon.model;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.util.List;

@Data
@Builder
@Document("team")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class PokemonTeamModel {

    @MongoId(FieldType.OBJECT_ID)
    @EqualsAndHashCode.Include
    private String id;

    @Field("pokemons")
    private List<String> pokemons;

}
