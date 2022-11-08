package br.com.kemoel.models;

public class User {
  public Long id;
  public String name;
  public String senha;
  public String userName;

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }
  public String getSenha() {
    return senha;
  }
  public void setSenha(String senha) {
    this.senha = senha;
  }
  public String getUserName() {
    return userName;
  }
  public void setUserName(String userName) {
    this.userName = userName;
  }
}
