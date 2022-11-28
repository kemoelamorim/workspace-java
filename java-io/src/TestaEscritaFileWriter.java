import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TestaEscritaFileWriter {
  public static void main(String[] args) throws IOException{
    BufferedWriter bw = new BufferedWriter(new FileWriter("java-io/lorem2.txt"));
    bw.write("Aqui vai a primeira linha e agora vamos pular 3 linhas.");
    bw.newLine();
    bw.newLine();
    bw.newLine();
    bw.write("Aqui estamos");
    bw.close();
  }
}
