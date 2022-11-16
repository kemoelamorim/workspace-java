package br.com.bytebank.banco.model;
public class GuardadorDeContas {

  private Conta[] referencias;
  private int posicaoLivre = 0;

  public GuardadorDeContas(){
    this.referencias = new Conta[10];
  }

  public void adiciona(Conta ref){
    this.referencias[posicaoLivre] = ref;
    this.posicaoLivre++;
  }
  public int getQuantidadeDeElementos(){
    return this.posicaoLivre;
  }
  public Conta getReferencia(int posicao){
    return this.referencias[posicao];
  }
}
