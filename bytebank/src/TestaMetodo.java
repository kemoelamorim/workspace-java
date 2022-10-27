public class TestaMetodo {
  public static void main(String[] args) {
    Conta contaDoPaulo = new Conta();
    contaDoPaulo.saldo = 100;
    contaDoPaulo.titular = "Paulo";
    contaDoPaulo.deposita(50);
    
    Conta contaDaMarcela = new Conta();
    contaDaMarcela.deposita(200);
    contaDaMarcela.titular = "Marcela";
    
    boolean transferiu = contaDaMarcela.transfere(contaDoPaulo, 25);
   
    System.out.println("Saldo da conta do " + contaDoPaulo.titular +" é: " + contaDoPaulo.saldo);
    System.out.println("Saldo da conta do " + contaDaMarcela.titular +" é: " + contaDaMarcela.saldo);
    
    if(transferiu){
      System.out.println("Transferencia realizada com  sucesso.");
    };
  }
}
