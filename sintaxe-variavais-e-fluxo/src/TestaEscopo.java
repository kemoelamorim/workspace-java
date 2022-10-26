public class TestaEscopo {
  public static void main(String[] args) {
    System.out.println("Testa Condicional");
    int idade = 10;
    int quantidadePessoas = 2;
    boolean acompanhado;
    if(quantidadePessoas >= 2){
      acompanhado = true;
    }else{
      acompanhado = false;
    }
    System.out.println("valor de acompanhado = " + acompanhado);
    
    if (idade >= 18 || acompanhado) {
      if(idade >= 18){
        System.out.println("Você tem mais que 18");
      }else{
        System.out.println("Você não é maior de idade, porém está acompanhado");
      }
      System.out.println("Pode entar, seja bem vindo.");
    }else{
      System.out.println("Você não tem mais que 18 e não está acompanhado.");
    }
  }
}
