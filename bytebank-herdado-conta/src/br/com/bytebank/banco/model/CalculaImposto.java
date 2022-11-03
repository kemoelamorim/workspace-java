package br.com.bytebank.banco.model;
public class CalculaImposto {
  
  private double totalImposto;

  public void registra(Tributavel tributavel){
     totalImposto +=tributavel.getValorImposto();
  }

  public double getTotalImposto() {
    return totalImposto;
  }

}
