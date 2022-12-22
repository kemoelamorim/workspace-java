package br.com.gerenciador;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Curso {
  private String nome;
  private String instrutor;
  private List<Aula> aulas = new LinkedList();
  private Set<Aluno> alunos = new HashSet<>();
  
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
  }
  public Set<Aluno> getAlunos() {
    return Collections.unmodifiableSet(alunos);
  }
}