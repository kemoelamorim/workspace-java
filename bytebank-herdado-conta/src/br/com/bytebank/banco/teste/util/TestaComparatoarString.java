package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

import br.com.bytebank.banco.model.Cliente;
import br.com.bytebank.banco.model.Conta;
import br.com.bytebank.banco.model.ContaCorrente;
import br.com.bytebank.banco.model.ContaPoupanca;
import br.com.bytebank.banco.model.NumeroDaContaComparator;
import br.com.bytebank.banco.model.TitularDaContaComparator;

public class TestaComparatoarString {
  public static void main(String[] args) {
    
    Conta cc1 = new ContaCorrente(12, 90);
    Cliente clienteCC1 = new Cliente();
    clienteCC1.setNome("Kemoel Amorim Miranda");
    cc1.setTitular(clienteCC1);
    cc1.deposita(2000);

    Conta cp1 = new ContaPoupanca(33, 77);
    Cliente clienteCP1 = new Cliente();
    clienteCP1.setNome("Nico");
    cp1.setTitular(clienteCP1);
    cp1.deposita(1000);

    Conta cc2 = new ContaCorrente(13, 90);
    Cliente clienteCC2 = new Cliente();
    clienteCC2.setNome("Andre");
    cc2.setTitular(clienteCC2);
    cc2.deposita(120);

    Conta cp2 = new ContaPoupanca(14, 90);
    Cliente clienteCP2 = new Cliente();
    clienteCP2.setNome("Carla");
    cp2.setTitular(clienteCP2);
    cp2.deposita(200);

    List<Conta> lista = new ArrayList();
    
    lista.add(cc1);
    lista.add(cp1);
    lista.add(cc2);
    lista.add(cp2);

    TitularDaContaComparator comparator = new TitularDaContaComparator();

    lista.sort(comparator);

    for (Conta conta : lista) {
      System.out.println(conta);
    }
  }
}
