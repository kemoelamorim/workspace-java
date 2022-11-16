package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;

import br.com.bytebank.banco.model.Conta;
import br.com.bytebank.banco.model.ContaCorrente;

public class Teste {
  public static void main(String[] args) {
    
    ArrayList<Conta> lista = new ArrayList();
    
    Conta cc1 = new ContaCorrente(1, 1);
    Conta cc2 = new ContaCorrente(3, 3);
    
    lista.add(cc1);
    lista.add(cc2);
    
    System.out.println("Tamanho: "+lista.size());
    Conta cc = (Conta) lista.get(0);
    System.out.println("Numero da Conta: "+cc.getAgencia());
    
    lista.remove(0);
    
    System.out.println("Tamanho: "+lista.size());
    Conta cc3 = new ContaCorrente(2333, 2333);
    Conta cc4 = new ContaCorrente(444, 4444);
    
    lista.add(cc3);
    lista.add(cc4);
    
    for (Object ref : lista) {
      System.out.println(ref);
    }
  }
}
