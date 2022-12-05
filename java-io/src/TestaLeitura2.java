import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class TestaLeitura2{
  public static void main(String[] args) throws IOException{
    Scanner scanner = new Scanner(new File("java-io/contas.csv"), "UTF-8");
    while (scanner.hasNextLine()) {
      String str = scanner.nextLine();
      //System.out.println(str);

      Scanner linhaScanner = new Scanner(str);
      linhaScanner.useLocale(Locale.US);
      linhaScanner.useDelimiter(",");

      String valor1 = linhaScanner.next();
      int valor2 = linhaScanner.nextInt();
      int valor3 = linhaScanner.nextInt();
      String valor4 = linhaScanner.next();
      double valor5 = linhaScanner.nextDouble();
      System.out.format(new Locale("pt", "BR"),"%s-%04d %08d %20s: %05.2f %n" , valor1, valor2, valor3, valor4, valor5);

      linhaScanner.close();

      // String[] valores = (str.split(","));
      // System.out.println(valores[3]);
    }
    scanner.close();
  }
}