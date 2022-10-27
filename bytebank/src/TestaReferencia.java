public class TestaReferencia {
  public static void main(String[] args) {
    Conta primeirConta = new Conta();
    primeirConta.saldo = 300;
    System.out.println(primeirConta);
    Conta segundaConta = primeirConta;
    System.out.println(segundaConta);

    if(primeirConta == segundaConta){
      System.out.println("São a mesmíssima conta.");
    } else {
      System.out.println("São contas diferentes");
    }
  }
}
