package br.com.bytebank.banco.teste;
public class TestaString {
  public static void main(String[] args) {
    String nome = "";
    StringBuilder bilder = new StringBuilder("Kemoel");
    nome = bilder.toString();
    System.out.println(nome);
  }
}
