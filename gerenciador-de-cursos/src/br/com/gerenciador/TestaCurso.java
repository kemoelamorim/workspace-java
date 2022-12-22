package br.com.gerenciador;

import java.util.List;

public class TestaCurso {
  public static void main(String[] args) {
    
    Curso javaColecoes = new Curso("Dominando as coleções do java.", "Kemoel Amorim Miranda");
    
    javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
    javaColecoes.adiciona(new Aula("Criando uma aula", 20));
    javaColecoes.adiciona(new Aula("Modelando com Coleções", 22));
 
    System.out.println(javaColecoes.getAulas());

  }
}
