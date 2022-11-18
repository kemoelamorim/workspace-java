package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TestaOutrosWrappers {
  public static void main(String[] args) {
    
    Integer idade = Integer.valueOf(28); //autoboxing
    System.out.println(idade.intValue()); //unboxing

    Double dRef = Double.valueOf(5400.90);
    System.out.println(dRef.doubleValue());

    Boolean bRef = Boolean.TRUE;
    System.out.println(bRef.booleanValue());

    Number numero = Integer.valueOf(30);
    System.out.println(numero.intValue());
    List<Number> lista = new ArrayList();
    lista.add(numero);
    lista.add(12.90 );
    System.out.println(lista);
  } 
}
