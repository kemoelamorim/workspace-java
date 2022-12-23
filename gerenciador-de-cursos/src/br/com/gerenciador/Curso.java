package br.com.gerenciador;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

public class Curso {
  private String nome;
  private String instrutor;
  private List<Aula> aulas = new LinkedList();
  private Set<Aluno> alunos = new LinkedHashSet<>();
  private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();

  public Curso(String nome, String instrutor){
    this.nome = nome;
    this.instrutor = instrutor;
  }

  public String getNome() {
    return nome;
  }
  public String getInstrutor() {
    return instrutor;
  }
  public List<Aula> getAulas() {
    return Collections.unmodifiableList(aulas);
  }
  public void adiciona(Aula aula){
    this.aulas.add(aula);
  }
  public int getTempoTotal(){
    return this.aulas.stream().mapToInt(Aula::getTempo).sum();
  }
  @Override
  public String toString() {
    
    return "[curso: " + this.nome + ", tempo total: " + this.getTempoTotal() + ", aulas: " + this.aulas + "]";
  }
  public void matricula(Aluno aluno){
    alunos.add(aluno);
    matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);
  }
  public Set<Aluno> getAlunos() {
    return Collections.unmodifiableSet(alunos);
  }
  public boolean estaMatriculado(Aluno aluno){
    return this.alunos.contains(aluno);
  }
  public Aluno buscaAlunoMatriculado(int numero){
    if(!matriculaParaAluno.containsKey(numero)){
      throw new NoSuchElementException("Maticula não encontrada: " + numero);
    }
    return matriculaParaAluno.get(numero);
  }
}
