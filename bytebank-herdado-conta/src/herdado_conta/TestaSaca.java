package herdado_conta;
public class TestaSaca {
  public static void main(String[] args) {
    ContaCorrente CC = new ContaCorrente(1220, 12);
    CC.deposita(200);
    try{

      CC.saca(200);
    }catch(SaldoInsuficienteException ex){
      System.out.println("Ex: "+ ex.getMessage());
    }
    System.out.println(CC.getSaldo());
  }
}
