package ordena;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class OrdenacaoString {
  public static void main(String[] args) {
    List<String> palavras = new ArrayList<>();
    palavras.add("Livraria");
    palavras.add("Manga");
    palavras.add("Futebol");
    palavras.add("Zebra");
    palavras.add("Amora");
    
    //Collections.sort(palavras, new ComparadorPorTamanho());
    
    // Comparator comparator = new ComparadorPorTamanho();
    // palavras.sort(comparator);

    Function<String, Integer> funcao = new Function<String, Integer>() {
      @Override
      public Integer apply(String s) {
        return s.length();
      };
    };
    palavras.sort(Comparator.comparing(funcao));

    palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
    palavras.sort(Comparator.comparing(s -> s.length()));
    palavras.sort(Comparator.comparing(String::length));
    Function<String, Integer> function = s -> s.length();
    Function<String, Integer> function2 = String::length;
    System.out.println(palavras);

    // Imprime na linha com Comsumer<String>
    Consumer<String> consumer = System.out::println;
    palavras.forEach(consumer);
    // Imprimindo com labda
    palavras.forEach( s -> System.out.println(s));
  }
}

