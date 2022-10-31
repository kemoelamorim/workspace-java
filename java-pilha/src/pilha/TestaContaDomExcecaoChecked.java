package pilha;
public class TestaContaDomExcecaoChecked {
  public static void main(String[] args) {
    Conta c = new Conta();
    try{
      c.deposita();
    }catch(MinhaExcecao ex){
      ex.printStackTrace();
      System.out.println("Tratamento...");
    }
  }
}
