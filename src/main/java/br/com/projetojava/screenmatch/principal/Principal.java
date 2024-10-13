package br.com.projetojava.screenmatch.principal;

import br.com.projetojava.screenmatch.model.DadosSerie;
import br.com.projetojava.screenmatch.service.ConsumoApi;
import br.com.projetojava.screenmatch.service.ConverteDados;
import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.Scanner;

public class Principal {

    private Scanner leitura = new Scanner(System.in);
    private ConsumoApi consumo = new ConsumoApi();

    private ConverteDados conversor = new ConverteDados();
    private final String ENDERECO = "https://www.omdbapi.com/?t=";
    private final String API_KEY = "&apikey=6585022c";

    public void exibMenu() throws JsonProcessingException {
        System.out.println("Digite o nome da série para a busca: ");
        var nomeSerie = leitura.nextLine();
        var json = consumo.obterDados(ENDERECO + nomeSerie.replace(" ", "+") + API_KEY);

        DadosSerie dados = conversor.obterDados(json, DadosSerie.class);

        System.out.println(dados);
        //"https://www.omdbapi.com/?t=gilmore+girls&apikey=6585022c"
    }
}