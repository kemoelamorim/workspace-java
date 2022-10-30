package herdado;
public class TestaSistema {
  public static void main(String[] args) {
    Gerente g = new Gerente();
    g.setSenha(2222);
    Administrador admin = new Administrador();
    admin.setSenha(2);
    SistemaInterno si = new SistemaInterno();
    si.autentica(g);
    si.autentica(admin);
    
  }
}
