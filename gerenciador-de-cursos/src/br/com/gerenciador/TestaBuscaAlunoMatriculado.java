package br.com.gerenciador;
public class TestaBuscaAlunoMatriculado {
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
    Aluno alunoMatriculado = javaColecoes.buscaAlunoMatriculado(7712);
    System.out.println(alunoMatriculado);
  }
}
