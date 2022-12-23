package br.com.gerenciador;

import java.util.Iterator;
import java.util.Set;

public class TestaCursoComAluno {
  public static void main(String[] args) {
    Curso javaColecoes = new Curso("Dominando as coleções do java", "Kemoel Miranda");
    javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
    javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
    javaColecoes.adiciona(new Aula("Modelando coleções", 24));
    Aluno a1 = new Aluno("Kemoel Miranda", 3652);
    Aluno a2 = new Aluno("Thamiris Santos", 7712);
    Aluno a3 = new Aluno("Ruth Mesquita", 1234);
    Aluno a4 = new Aluno("Ana Santos", 1234);

    javaColecoes.matricula(a1);
    javaColecoes.matricula(a2);
    javaColecoes.matricula(a3);
    javaColecoes.matricula(a4);

    System.out.println("Todos os alunos matriculados");
    //javaColecoes.getAlunos().forEach(aluno -> System.out.println(aluno));
    
    Set<Aluno> alunos = javaColecoes.getAlunos();
    Iterator<Aluno> iterator = alunos.iterator();
    
    while(iterator.hasNext()){
      System.out.println(iterator.next());
    }

    System.out.println("--------------------------------------------");
    
    Aluno muka = new Aluno("Kemoel Miranda", 3652);
    System.out.println("Kemoel Miranda Está matriculado?");
    
    System.out.println(javaColecoes.estaMatriculado(muka));
    System.out.println(a1.equals(muka));
    System.out.println(a1.hashCode() == muka.hashCode());
  }
}
