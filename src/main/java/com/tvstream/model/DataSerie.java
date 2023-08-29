package com.tvstream.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DataSerie(@JsonAlias("título") String Title,
                        @JsonAlias("total temporadas") int totalSeasons,
                        @JsonAlias("avaliacao") String imdbRating) {
}
