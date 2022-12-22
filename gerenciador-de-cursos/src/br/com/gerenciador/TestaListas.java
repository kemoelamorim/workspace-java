package br.com.gerenciador;

import java.util.ArrayList;
import java.util.Collections;

public class TestaListas {
  public static void main(String[] args) {
    String aula1 = "Conhecendo mais de Listas";
    String aula2 = "Modelando a classe Aula";
    String aula3 = "Trabalhando com Cursos e Sets";

    ArrayList<String> aulas = new ArrayList<>();
    aulas.add(aula1);
    aulas.add(aula2);
    aulas.add(aula3);

    aulas.forEach(aula -> System.out.println(aula));
    System.out.println("-------------------------------------");
    
    aulas.remove(0);
    
    aulas.add("Aumentando nosso conhecimento");
    
    for(String aula : aulas){
      System.out.println(aula);
    }

    System.out.println("-------------------------------------");
    
    Collections.sort(aulas);
    
    for(int i = 0; i < aulas.size(); i++){
      System.out.println("aula: " + aulas.get(i));
    }
    
    
  }
}
