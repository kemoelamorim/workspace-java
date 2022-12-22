package br.com.gerenciador;
public class TestaCursoComAluno {
  public static void main(String[] args) {
    Curso javaColecoes = new Curso("Dominando as coleções do java", "Kemoel Miranda");
    javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
    javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
    javaColecoes.adiciona(new Aula("Modelando coleções", 24));
    Aluno a1 = new Aluno("Kemoel Miranda", 3652);
    Aluno a2 = new Aluno("Thamiris Santos", 7712);
    Aluno a3 = new Aluno("Ruth Mesquita", 1234);

    javaColecoes.matricula(a1);
    javaCols.matricula(a2);
    javaColecoes.matricula(a3);

    System.out.println("Todos os alunos matriculados");
    javaColecoes.getAlunos().forEach(aluno -> System.out.println(aluno   ));

  }
}
