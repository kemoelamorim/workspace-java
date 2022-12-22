package br.com.gerenciador;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

import javax.swing.JSpinner.NumberEditor;

public class TestaPerformance {
  public static void main(String[] args) {
    Collection<Integer> numeros = new HashSet<Integer>();
    //Collection<Integer> numeros = new ArrayList<Integer>();
    long inicio = System.currentTimeMillis();
    for(int i = 1; i <= 50000; i++){
      numeros.add(i);
    }
    for(Integer numero : numeros){
      numeros.contains(numero);
    }
    long fim = System.currentTimeMillis();
    long tempoDeExecucao = fim - inicio;
    System.out.println(tempoDeExecucao);
  }
}