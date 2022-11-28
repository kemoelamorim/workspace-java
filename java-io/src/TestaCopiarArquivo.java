import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.Socket;

public class TestaCopiarArquivo {
  public static void main(String[] args) throws IOException {
    
    // Fluxo de entrada pelo teclado
    //InputStream fInputStream = System.in;
    
    // Fluxo de entrada pelo arquivo
    //InputStream fInputStream = new FileInputStream("java-io/lorem.txt");

    //Fluxo de entrada pela rede
    Socket s = new Socket();
    
    InputStream fInputStream = s.getInputStream();
    InputStreamReader iReader = new InputStreamReader(fInputStream);
    BufferedReader bReader = new BufferedReader(iReader); 
    
    //Fluxo de Saida de console
    //OutputStream fOutputStream = System.out;
    
    // Fluxo de Saída arquivo
    //OutputStream fOutputStream = new FileOutputStream("java-io/lorem2.txt");

    // Fluxo de Saída Rede
    OutputStream fOutputStream = s.getOutputStream();

    Writer writer = new OutputStreamWriter(fOutputStream);
    BufferedWriter bOutputStream = new BufferedWriter(writer);

    String linha = bReader.readLine();
    
    while(linha != null && !linha.isEmpty()) {
      bOutputStream.write(linha);
      bOutputStream.newLine();
      bOutputStream.flush();
      linha = bReader.readLine();
    }

    bReader.close();
    bOutputStream.close();
  }
}
