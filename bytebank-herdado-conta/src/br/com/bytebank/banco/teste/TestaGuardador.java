package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.model.Conta;
import br.com.bytebank.banco.model.ContaCorrente;
import br.com.bytebank.banco.model.GuardadorDeContas;

public class TestaGuardador{
  public static void main(String[] args) {
    GuardadorDeContas guardador = new GuardadorDeContas();
    Conta cc = new ContaCorrente(333, 2);
    Conta cc2 = new ContaCorrente(3, 2);
    guardador.adiciona(cc);
    guardador.adiciona(cc2);
    int tamanho = guardador.getQuantidadeDeElementos();
    Conta ref = guardador.getReferencia(0);
    System.out.println(tamanho);
    System.out.println(ref.getNumero());
    
  }

}