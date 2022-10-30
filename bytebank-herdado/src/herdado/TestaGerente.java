package herdado;
public class TestaGerente {
  public static void main(String[] args) {
    Gerente g1 = new Gerente(2222);
    g1.setNome("Kemoel Amorim Miranda");
    g1.setSalario(1000);
    g1.setCpf("000-000-000-00");

    System.out.println(g1.getNome());
    System.out.println(g1.getSalario());
    System.out.println(g1.getCpf());
    System.out.println(g1.autentica(2222));

    System.out.println(g1.getBonificacao());
  }
}
