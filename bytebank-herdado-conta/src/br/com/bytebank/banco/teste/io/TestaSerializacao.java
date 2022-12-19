package br.com.bytebank.banco.teste.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import br.com.bytebank.banco.model.Cliente;
import br.com.bytebank.banco.model.ContaCorrente;

public class TestaSerializacao {
  public static void main(String[] args) throws IOException, ClassNotFoundException, FileNotFoundException{
    
    Cliente cliente = new Cliente();
    cliente.setNome("KEMOEL AMORIM MIRANDA");
    cliente.setCpf("111.111.111-11");
    cliente.setProfissao("Programador");

    ContaCorrente cc = new ContaCorrente(111, 222);
    cc.setTitular(cliente);
    cc.deposita(1000);
    
    ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("bytebank-herdado-conta/cliente.bin"));
    oos.writeObject(cc);
    oos.close();
   
  }
}
