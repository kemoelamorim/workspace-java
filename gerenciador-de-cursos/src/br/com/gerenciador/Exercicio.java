package br.com.gerenciador;

import java.util.HashMap;
import java.util.Map;

public class Exercicio {
  public static void main(String[] args) {
    Map<Integer, String> pessoas = new HashMap<>();
    pessoas.put(19, "Carol");
    pessoas.put(28, "Kemoel");
    pessoas.put(30, "Eduarda");

    pessoas.keySet().forEach(idade -> System.out.println(pessoas.get(idade)));
  }
}
