package br.com.projetojava.screenmatch;

import br.com.projetojava.screenmatch.model.DadosEpisodio;
import br.com.projetojava.screenmatch.model.DadosSerie;
import br.com.projetojava.screenmatch.service.ConsumoApi;
import br.com.projetojava.screenmatch.service.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var consumoApi = new ConsumoApi();

		var json = consumoApi.obterDados("https://www.omdbapi.com/?t=game+of+thrones&apikey=f25593e7");
		var jsonep = consumoApi.obterDados("https://www.omdbapi.com/?t=game+of+thrones&season=1&episode=2&apikey=f25593e7");
		ConverteDados conversor = new ConverteDados();
		DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
		DadosEpisodio dadosep = conversor.obterDados(jsonep, DadosEpisodio.class);
		System.out.println(dados);
		System.out.println(dadosep);
	}
}
