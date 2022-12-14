package herdado;

public class Administrador extends Funcionario implements Autenticavel {

  private AutenticadorUtil autenticador;
  
  public Administrador(){
    autenticador = new AutenticadorUtil();
  }

  public void setSenha(int senha) {
    this.autenticador.setSenha(senha);
  }

  public boolean autentica(int senha) {
    return this.autenticador.autentica(senha);
  }
}
