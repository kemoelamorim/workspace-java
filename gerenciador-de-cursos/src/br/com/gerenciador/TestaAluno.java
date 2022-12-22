package br.com.gerenciador;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestaAluno {
  public static void main(String[] args) {
    Collection<String> alunos = new HashSet<>();
    alunos.add("Kemoel Amorim Miranda");
    alunos.add("Alberto Souza");
    alunos.add("Sergio Lopes");
    alunos.add("Nico Steppat");
    boolean contem =  alunos.contains("Kemoel Amorim Miranda");
    System.out.println(contem);
    alunos.forEach(aluno -> System.out.println(aluno));
    List<String> listaDeAlunos = new ArrayList<>(alunos);
    Collections.sort(listaDeAlunos);
    System.out.println(listaDeAlunos);

    boolean adicionou = alunos.add("Kemoel Amorim Miranda");
    System.out.println(alunos.size());
  }
}
