package br.com.bytebank.banco.teste.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import br.com.bytebank.banco.model.ContaCorrente;

public class TestaDeserializacao {
  public static void main(String[] args) throws IOException, ClassNotFoundException, FileNotFoundException {
    ObjectInputStream ois = new ObjectInputStream(new FileInputStream("bytebank-herdado-conta/cliente.bin"));
    ContaCorrente ccContaCorrente = (ContaCorrente) ois.readObject();
    ois.close();
    System.out.println(ccContaCorrente.getSaldo());
  }
}
