package br.com.gerenciador;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaAula {
  public static void main(String[] args) {
    Aula a1 = new Aula("Revisando as ArrayLists", 21);
    Aula a2 = new Aula("Aperfeiçoando Listas e Objetos", 15);
    Aula a3 = new Aula("Relacianamento de listas e objetos", 11);
    
    ArrayList<Aula> aulas = new ArrayList<>();
    
    aulas.add(a1);
    aulas.add(a2);
    aulas.add(a3);

    // Ordena por titulo sobrescrita comparatorTo
    Collections.sort(aulas);
    System.out.println(aulas);

    // Ordena por tempo Comparator.comparing 
    Collections.sort(aulas, Comparator.comparing(Aula::getTempo));
    // aulas.sort(Comparator.comparing(Aula::getTempo));  // Mesmo efeito acima
    System.out.println(aulas);
  }
}
