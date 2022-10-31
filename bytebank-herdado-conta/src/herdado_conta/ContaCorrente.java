package herdado_conta;

public class ContaCorrente extends Conta implements Tributavel{

  public ContaCorrente(int numero, int agencia) {
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
  @Override
  public void saca(double valor) throws SaldoInsuficienteException{
    double novoValor = valor + 0.2;
    super.saca(novoValor);
  }

  @Override
  public double getValorImposto() {
    return super.getSaldo() * 0.01;
  }
  
}
