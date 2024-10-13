package br.com.projetojava.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;
import java.util.List;


@JsonIgnoreProperties(ignoreUnknown = true)

public record DadosTemporada(@JsonAlias("totalSeasons") Integer numero,
                             @JsonAlias("Episodes") List <DadosEpisodio> episodios) {


}
