package herdado_conta;

public abstract class Conta {
  private static int total;
  protected double saldo;
  private int agencia;
  private int numero;
  private Cliente titular;

  public Conta(int numero, int agencia){
    setNumero(numero);
    setAgencia(agencia);
    Conta.total++;
  }

  public boolean saca(double valor) {
    if (this.saldo >= valor && valor > 0) {
      this.saldo -= valor;
      return true;
    }
    return false;
  }

  public abstract void deposita(double valor);

  public boolean transfere(Conta contaDestino, double valor) {
    if (this.saca(valor)) {
      contaDestino.deposita(valor);
      return true;
    }
    return false;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("O Saldo da conta é: " + saldo + '\n');
    builder.append("O titular da conta é: " + titular + '\n');
    builder.append("O numero da conta é: " + numero + '\n');
    builder.append("A agencia da conta é: " + agencia + '\n');
    return builder.toString();
  }

  public double getSaldo() {
    return this.saldo;
  }

  public int getNumero() {
    return this.numero;
  }
  public void setNumero(int numero) {
    if(numero <= 0){
      throw new Error("Não é possível criar uma conta com numero negativo.");
    }
    this.numero = numero;
  }
  public int getAgencia() {
    return agencia;
  }
  public void setAgencia(int agencia) {
    if(agencia <= 0){
      throw new Error("Não é possível criar uma conta com agencia negativo.");
    }
    this.agencia = agencia;
  }
  public void setTitular(Cliente titular) {
    this.titular = titular;
  }
  public Cliente getTitular() {
    return titular;
  }
  public static int getTotal() {
    return total;
  }
}
