package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;

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

        ArrayList<Titulo> lista = new ArrayList<>();
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

    }
}
