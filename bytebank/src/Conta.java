public class Conta {
  double saldo;
  int agencia;
  int numero;
  String titular;

  public boolean saca(double valor){
    if(this.saldo >= valor){
      this.saldo -= valor;
      return true;
    }
    return false;
  }
  public void deposita(double valor){
    if(valor > 0){
      this.saldo += valor;
    }else{
      throw new Error("Valor " + valor + ", não pode ser depositado");
    }
  }
  public boolean transfere(Conta contaDestino, double valor){
    if(this.saca(valor)){
      contaDestino.deposita(valor);
      return true;
    }
    return false;
  }
  
  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append("O Saldo da conta é: "+saldo + '\n');
    builder.append("O titular da conta é: "+titular + '\n');
    builder.append("O numero da conta é: "+numero + '\n');
    builder.append("A agencia da conta é: "+agencia + '\n');
    return builder.toString();
  }
}
