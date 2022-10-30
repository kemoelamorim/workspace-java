package herdado_conta;

public class Cliente {
  private String nome;
  private String cpf;
  private String profissao;

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }
  public String getCpf() {
    return cpf;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }
  public String getNome() {
    return nome;
  }
  public void setProfissao(String profissao) {
    this.profissao = profissao;
  }
  public String getProfissao() {
    return profissao;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
    builder.append(nome);
    return builder.toString();
  }
}