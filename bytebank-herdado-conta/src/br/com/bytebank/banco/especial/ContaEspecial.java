package br.com.bytebank.banco.especial;

import br.com.bytebank.banco.model.Conta;

public class ContaEspecial extends Conta{

  public ContaEspecial(int numero, int agencia) {
    super(numero, agencia);
  }

  @Override
  public void deposita(double valor) {
    super.saldo += valor;
  }
  
}
