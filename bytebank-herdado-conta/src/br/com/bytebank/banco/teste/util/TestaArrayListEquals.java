package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;

import br.com.bytebank.banco.model.Conta;
import br.com.bytebank.banco.model.ContaCorrente;

public class TestaArrayListEquals {
  public static void main(String[] args) {

    // Conta cc1 = new ContaCorrente(1, 1);
    // Conta cc2 = new ContaCorrente(1, 1);

    // boolean igual = cc1.equals(cc2);
    // System.out.println(igual);

    // Generics
    ArrayList<Conta> lista = new ArrayList<Conta>();
    
    Conta cc1 = new ContaCorrente(1, 1);
    Conta cc2 = new ContaCorrente(1, 1);

    lista.add(cc1);
    lista.add(cc2);

    Conta cc3 = new ContaCorrente(1, 1);
    
    // O método contains usa o m equals sobrescrito na class Conta.
    boolean existeConta = lista.contains(cc3);
    System.out.println("Já existe: " + existeConta);

    for (Conta conta : lista) {
      if(conta.equals(cc3)){
        System.out.println("já tenho essa conta.");
      }
    }
    for (Conta ref : lista) {
      System.out.println(ref);
    }
  }
}
