package kemoel;
public class TestaValores {
  public static void main(String[] args) {
    Conta conta = new Conta(1001, 3001);
    Conta conta2 = new Conta(4001, 3001);
    
    System.out.println("Total de contas criadas: " + Conta.getTotal());
  }
}
