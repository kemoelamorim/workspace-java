package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.especial.ContaEspecial;
import br.com.bytebank.banco.model.ContaCorrente;
import br.com.bytebank.banco.model.ContaPoupanca;
import br.com.bytebank.banco.model.SaldoInsuficienteException;

public class TestaContas {
  public static void main(String[] args) throws SaldoInsuficienteException {
    ContaCorrente contaCorrente = new ContaCorrente(111, 111);
    contaCorrente.deposita(100);

    ContaPoupanca contaPoupanca = new ContaPoupanca(111, 222);
    contaPoupanca.deposita(200);

    contaCorrente.transfere(contaPoupanca, 10);
    
    ContaEspecial contaEspecial = new ContaEspecial(12, 21);
    contaEspecial.deposita(100);
    System.out.println(contaEspecial.getSaldo());

    System.out.println("CC >> " + contaCorrente.getSaldo());
    System.out.println("CP >> " + contaPoupanca.getSaldo());
    System.out.println("CE >> " + contaEspecial.getSaldo());
    System.out.println(contaCorrente.getTotal());
  }
}
