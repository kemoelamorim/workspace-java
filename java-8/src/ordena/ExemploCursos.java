package ordena;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ExemploCursos {
  public static void main(String[] args) {
    List<Curso> cursos = new ArrayList();
    cursos.add(new Curso("Python", 12));
    cursos.add(new Curso("Java", 22));
    cursos.add(new Curso("Node", 39));
    cursos.add(new Curso("Cshap", 17));
    cursos.sort(Comparator.comparing(Curso::getAlunos));
    int sum = cursos.stream()
      .filter(c -> c.getAlunos() > 20)
      .mapToInt(Curso::getAlunos)
      .sum();
    
      System.out.println(sum);

    cursos.stream()
      .filter( c -> c.getAlunos() >= 20)
      .findAny()
      .ifPresent(c -> System.out.println(c.getNome()));

    cursos.stream()
      .filter(c -> c.getAlunos() > 20)
      .collect(Collectors.toMap(
        c -> c.getNome(),
        c -> c.getAlunos()))
      .forEach((nome, alunos) -> System.out.println(nome + " " + alunos));
    //System.out.println(optionalCurso.get().getNome());
    //System.out.println(optionalCurso.orElse(null).getNome());
    // optionalCurso.ifPresent(c -> System.out.println(c.getNome()));
  }
}
