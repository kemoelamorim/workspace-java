package pilha;
public class FluxoComError {
  public static void main(String[] args) {
    System.out.println("Inicio do método main...");
    try {
      metodo1();
    } catch (ArithmeticException | NullPointerException | MinhaExcecao ex) {
      System.out.println("Exception: " + ex.getMessage());
      ex.printStackTrace();
    }
    System.out.println("Fim do método main...");
  }
  private static void metodo1(){
    System.out.println("Inicio método1 ...");
    metodo2();
    System.out.println("Fim do método1");
  }
  private static void metodo2(){
    System.out.println("Início do método2 ...");
    metodo2();
    System.out.println("Fim do método 2 ...");
  }
}
