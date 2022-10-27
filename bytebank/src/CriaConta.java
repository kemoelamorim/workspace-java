public class CriaConta {
  public static void main(String[] args) {
    Conta primeiraConta = new Conta();
    primeiraConta.saldo = 1200.9;
    primeiraConta.agencia = 1001;
    primeiraConta.numero = 3301;
    primeiraConta.titular = "Kemoel Amorim Miranda";
    System.out.println(primeiraConta); 

    Conta segundaConta = new Conta();
    segundaConta.agencia = 1002;
    segundaConta.numero = 3302;
    segundaConta.titular = "Thamiris Ruany dos Santos Miranda";
    segundaConta.saldo = 4900.23;
    System.out.println(segundaConta);

  }
}
