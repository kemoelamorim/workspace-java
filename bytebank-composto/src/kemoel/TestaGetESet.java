package kemoel;
public class TestaGetESet {
  public static void main(String[] args) {
    Conta conta = new Conta(1001, 3001);
   
    System.out.println(conta.getNumero());
    Cliente kemoel = new Cliente();
    kemoel.setNome("kemoel");
    conta.setTitular(kemoel);
  }
}
