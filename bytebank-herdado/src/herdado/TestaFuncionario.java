package herdado;
public class TestaFuncionario {
  public static void main(String[] args) {
    Funcionario kemoel = new Gerente();
    kemoel.setNome("Kemoel Amorim Miranda");
    kemoel.setCpf("222-222-222-22");
    kemoel.setSalario(5400);
    System.out.println(kemoel.getNome());
    System.out.println(kemoel.getBonificacao());
  }
}
