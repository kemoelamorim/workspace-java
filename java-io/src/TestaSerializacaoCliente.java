import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class TestaSerializacaoCliente {
  public static void main(String[] args) throws IOException, ClassNotFoundException {
    Cliente cliente = new Cliente();
    cliente.setNome("KEMOEL AMORIM MIRANDA");
    cliente.setCpf("111.111.111-11");
    cliente.setProfissao("Programador");

    // ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("java-io/cliente.bin"));
    // oos.writeObject(cliente);
    // oos.close();

    ObjectInputStream ois = new ObjectInputStream(new FileInputStream("java-io/cliente.bin"));
    Cliente cc = (Cliente) ois.readObject();
    ois.close();
    System.out.println(cc.getNome());

  }
}
