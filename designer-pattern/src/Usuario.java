public class Usuario {
  private String nome;
  private Endereco entrega;
  public void setNome(String nome) {
    this.nome = nome;
  }
  public String getNome() {
    return nome;
  }
  public void setEntrega(Endereco entrega) {
    this.entrega = entrega;
  }
  public Endereco getEntrega() {
    return entrega;
  }
}
