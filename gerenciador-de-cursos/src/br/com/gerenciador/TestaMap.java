package br.com.gerenciador;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class TestaMap {
  public static void main(String[] args) {
    Map<String, Integer> pessoas = new HashMap<>();
    Set<Entry<String, Integer>> associacoes = pessoas.entrySet();

    pessoas.put("Kemoel", 18);
    pessoas.put("Leo",27);
    pessoas.put("Camila", 31);
    pessoas.put("Fernanda", 19);

    pessoas.values().forEach(idade -> System.out.println(idade));
    pessoas.keySet().forEach(nome -> System.out.println(nome));

    for (Entry<String, Integer> associacao : associacoes) {
      System.out.println(associacao.getKey() + " - " + associacao.getValue());
    }
  }
}
