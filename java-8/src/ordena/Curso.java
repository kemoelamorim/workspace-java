package ordena;
public class Curso {
  private String nome;
  private int alunos;
  public Curso(String nome, int alunos){
    this.nome = nome;
    this.alunos = alunos;
  }
  public int getAlunos() {
    return alunos;
  }public void setAlunos(int alunos) {
    this.alunos = alunos;
  }public String getNome() {
    return nome;
  }public void setNome(String nome) {
    this.nome = nome;
  }
  @Override
  public String toString() {
    return " Nome -> " +getNome();
  }
}
