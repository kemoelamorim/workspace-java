package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

import br.com.bytebank.banco.model.Conta;
import br.com.bytebank.banco.model.ContaCorrente;
import br.com.bytebank.banco.model.NumeroDaContaComparator;

public class TestaOrdenacao {
  public static void main(String[] args) {
    List<Conta> lista = new ArrayList();
    Conta c1 = new ContaCorrente(19, 90);
    Conta c2 = new ContaCorrente(12, 90);
    Conta c3 = new ContaCorrente(32, 90);
    lista.add(c1);
    lista.add(c2);
    lista.add(c3);
    // NumeroDaContaComparator comparator = new NumeroDaContaComparator();
    // lista.sort(comparator);
    lista.sort(new NumeroDaContaComparator());
    for (Conta conta : lista) {
      System.out.println(conta);
    }
  }
}
