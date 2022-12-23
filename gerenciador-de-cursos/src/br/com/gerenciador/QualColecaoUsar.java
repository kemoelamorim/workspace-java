package br.com.gerenciador;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class QualColecaoUsar {
  public static void main(String[] args) {
    List<Aluno> alunos = new LinkedList<>();

    Aluno a1 = new Aluno("testa", 0);
    System.out.println(alunos.add(a1));
    System.out.println(alunos.size());
    System.out.println(alunos.contains(new Aluno("testa", 0)));
    System.out.println(alunos.get(0));
  }
}
