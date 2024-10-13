package br.com.projetojava.screenmatch;

import br.com.projetojava.screenmatch.model.DadosTemporada;
import br.com.projetojava.screenmatch.principal.Principal;
import br.com.projetojava.screenmatch.service.ConsumoApi;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal();
		var consumoApi = new ConsumoApi();
		principal.exibMenu();
		List<DadosTemporada> temporadas = new ArrayList<>();




}
	}
