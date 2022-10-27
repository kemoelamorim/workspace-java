package kemoel;

public class TestaSacaNegativo {
  public static void main(String[] args) {
    Conta conta = new Conta(1001, 3001);
    conta.deposita(100);
    System.out.println(conta.saca(101));
    System.out.println(conta.getSaldo());
  }
}
