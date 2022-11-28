import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class TestaEscritaPrintStreamPrintWriter {
  public static void main(String[] args) throws IOException{

    // PrintStream ps = new PrintStream("java-io/lorem2.txt");
    PrintWriter ps = new PrintWriter("java-io/lorem2.txt");
    ps.println("Vamos usar o PrintStream para fluxo de escrita");
    ps.println();
    ps.println();
    ps.println();
    ps.println("Ultima linha para printar");
    ps.close();
  }
}
