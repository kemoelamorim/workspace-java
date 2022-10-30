package herdado;

public class Gerente extends Funcionario implements Autenticavel {
  
  private AutenticadorUtil autenticador;
  
  public Gerente(){
    autenticador = new AutenticadorUtil();
  }
  
  public void setSenha(int senha) {
    this.autenticador.setSenha(senha);
  }
  
  public boolean autentica(int senha) {
    return this.autenticador.autentica(senha);
  }
  
  @Override
  public double getBonificacao() {
    return super.getSalario();
  }

}
