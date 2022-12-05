import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestaLeitura {
  public static void main(String[] args) throws IOException {
    // Fluxo de entrada de um arquivo
    FileInputStream fInputStream = new FileInputStream("java-io/lorem.txt");
    InputStreamReader iReader = new InputStreamReader(fInputStream, "UTF-8");
    BufferedReader bReader = new BufferedReader(iReader); 
    
    String linha = bReader.readLine();
    
    while(linha != null) {
      System.out.println(linha);
      linha = bReader.readLine();
    }

    bReader.close();
  
  }
}
