package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Star Wars", 1977);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Interestelar", 2014);
        outroFilme.avalia(6);
        var maisUmFilme = new Filme("O Tigre e a Neve", 2007);
        maisUmFilme.avalia(10);
        Serie lost = new Serie("Lost", 2000);

        Filme f1 = meuFilme;

        List<Titulo> lista = new LinkedList<>();
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(maisUmFilme);
        lista.add(lost);
        for (Titulo item : lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação " + filme.getClassificacao());
            }
        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Mark Hammil");
        buscaPorArtista.add("Anne Hathaway");
        buscaPorArtista.add("Guilherme Mergulhão");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação");
        System.out.println(buscaPorArtista);

        System.out.println("Lista de titulos ordenados");
        Collections.sort(lista);
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("ordenando por ano");
        System.out.println(lista);
    }
}
