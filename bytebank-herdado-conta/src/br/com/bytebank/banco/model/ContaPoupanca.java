package br.com.bytebank.banco.model;

public class ContaPoupanca extends Conta{

  public ContaPoupanca(int numero, int agencia) {
    super(numero, agencia);
  }
  @Override
  public void deposita(double valor) {
    if (valor > 0) {
      super.saldo += valor;
    } else {
      throw new RuntimeException("Valor " + valor + ", não pode ser depositado");
    }
  }
}
