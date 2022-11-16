package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.especial.ContaEspecial;
import br.com.bytebank.banco.model.Conta;
import br.com.bytebank.banco.model.ContaCorrente;
import br.com.bytebank.banco.model.ContaPoupanca;

public class TestaArrayConta {
  public static void main(String[] args) {
    Conta[] contas = new Conta[5];

    Conta cc1 = new ContaCorrente(12, 12);
    contas[0] = cc1;

    ContaPoupanca cc2 = new ContaPoupanca(32, 32);
    contas[1] = cc2;
    contas[2] = new ContaEspecial(1, 12);
    ContaEspecial ref = (ContaCorrente) contas[2];
    System.out.println(ref.getNumero());

  }
}
