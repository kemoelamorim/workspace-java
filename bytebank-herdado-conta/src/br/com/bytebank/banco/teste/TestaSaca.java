package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.model.ContaCorrente;
import br.com.bytebank.banco.model.SaldoInsuficienteException;

public class TestaSaca {
  public static void main(String[] args) {
    ContaCorrente CC = new ContaCorrente(1220, 12);
    try{
      CC.deposita(200);

      CC.saca(200);
    }catch(SaldoInsuficienteException ex){
      System.out.println("Ex: "+ ex.getMessage());
    }
    System.out.println(CC.getSaldo());
  }
}
