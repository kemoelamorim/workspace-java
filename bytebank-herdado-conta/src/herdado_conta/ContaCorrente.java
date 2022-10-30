package herdado_conta;

public class ContaCorrente extends Conta{

  public ContaCorrente(int numero, int agencia) {
    super(numero, agencia);
  }
  
  @Override
  public void deposita(double valor) {
    if (valor > 0) {
      super.saldo += valor;
    } else {
      throw new Error("Valor " + valor + ", não pode ser depositado");
    }
    
  }
  @Override
  public boolean saca(double valor) {
    double novoValor = valor + 0.2;
    return super.saca(novoValor);
  }
  
}
