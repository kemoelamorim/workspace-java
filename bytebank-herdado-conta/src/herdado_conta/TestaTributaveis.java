package herdado_conta;
public class TestaTributaveis {
  public static void main(String[] args) {
    
    ContaCorrente cc = new ContaCorrente(1990, 190);
    cc.deposita(-100);
    try {
      
    } catch (Exception e) {
      e.printStackTrace();
    }
    
    SeguroDeVida seguroDeVida = new SeguroDeVida();
    
    CalculaImposto calculaImposto = new CalculaImposto();
    calculaImposto.registra(cc);
    calculaImposto.registra(seguroDeVida);
    System.out.println(calculaImposto.getTotalImposto());
  }
}
