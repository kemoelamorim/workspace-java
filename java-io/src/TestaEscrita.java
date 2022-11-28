import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TestaEscrita {
  public static void main(String[] args) throws IOException {
    FileOutputStream fOutputStream = new FileOutputStream("java-io/lorem.txt");
    Writer writer = new OutputStreamWriter(fOutputStream);
    BufferedWriter bOutputStream = new BufferedWriter(writer);

    bOutputStream.write("Agora estamos escrevendo no arquivo");
    bOutputStream.newLine();
    bOutputStream.write("Pulamos a linha e aqui estamos...Valew");
    bOutputStream.close();
  }
}
