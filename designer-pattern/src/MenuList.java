public abstract class MenuList {
  public static void menu1(){
    StringBuilder builder = new StringBuilder();
    builder.append("1. Realizar pedido.");
    builder.append("2. Trocar Nome.");
    builder.append("3 Trocar endereço.");
    builder.append("4. Sair");
    System.out.println(builder.toString());
  }
  public static void menu2(){
    StringBuilder builder = new StringBuilder();
    builder.append("1. Hamburguer 200g R$: " + Produto.HAMBURGUER );
    builder.append("2. Batata Frita 300g R$: " + Produto.BATATA_FRITA);
    builder.append("3. Refrigerante Lata R$: " + Produto.REFRIGERANTE_LATA);
    builder.append("4. Refrigerante 1,5L R$: " + Produto.REFRIGERANTE_LITRO);
    builder.append("5. Pote de Sorvete R$: " + Produto.POTE_SORVETE);
    builder.append("6. Ver Carrinho");
    builder.append("7. Sair");
    System.out.println(builder.toString());
  }
}
