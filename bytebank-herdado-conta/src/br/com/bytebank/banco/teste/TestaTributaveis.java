package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.model.CalculaImposto;
import br.com.bytebank.banco.model.ContaCorrente;
import br.com.bytebank.banco.model.SeguroDeVida;

public class TestaTributaveis {
  public static void main(String[] args) {
    
    ContaCorrente cc = new ContaCorrente(1990, 190);
    try {
      cc.deposita(100);
      
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
