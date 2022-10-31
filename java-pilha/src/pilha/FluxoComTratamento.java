package pilha;

import javax.management.MBeanException;

public class FluxoComTratamento {
  public static void main(String[] args) {
    System.out.println("Inicio do método main...");
    try {
      metodo1();
    } catch (Exception ex) {
      System.out.println("Exception: " + ex.getMessage());
      ex.printStackTrace();
    }
    System.out.println("Fim do método main...");
  }
  private static void metodo1() throws MinhaExcecao{
    System.out.println("Inicio método1 ...");
    metodo2();
    System.out.println("Fim do método1");
  }
  private static void metodo2() throws MinhaExcecao{
    System.out.println("Início do método2 ...");
    throw new MinhaExcecao("Deu muito Ruim");
    //System.out.println("Fim do método 2 ...");
  }
}