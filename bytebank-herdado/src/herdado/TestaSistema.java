package herdado;

import javax.crypto.Cipher;

public class TestaSistema {
  public static void main(String[] args) {
   Gerente gerente = new Gerente();
   gerente.setSenha(2222);
   Cliente cliente = new Cliente();
   cliente.setSenha(2222);
   Administrador admin = new Administrador();
   admin.setSenha(2222);

   SistemaInterno si = new SistemaInterno();
   si.autentica(gerente);
   si.autentica(cliente);
   si.autentica(admin);
  }
}
