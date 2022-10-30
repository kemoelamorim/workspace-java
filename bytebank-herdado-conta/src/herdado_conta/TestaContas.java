package herdado_conta;
public class TestaContas {

  public static void main(String[] args) {
    ContaCorrente contaCorrente = new ContaCorrente(111, 111);
    contaCorrente.deposita(100);

    ContaPoupanca contaPoupanca = new ContaPoupanca(111, 222);
    contaPoupanca.deposita(200);

    contaCorrente.transfere(contaPoupanca, 10);

    System.out.println("CC >> " + contaCorrente.getSaldo());
    System.out.println("CP >> " + contaPoupanca.getSaldo());
    System.out.println(contaCorrente.getTotal());
  }
}
