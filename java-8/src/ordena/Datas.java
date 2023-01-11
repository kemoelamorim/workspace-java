package ordena;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Datas {
  public static void main(String[] args) {
    LocalDate hoje = LocalDate.now();
    LocalDate proximaCopa = LocalDate.of(2026, Month.JUNE, 8);
    
    Period period = Period.between(hoje, proximaCopa);
    
    DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    DateTimeFormatter formatHora = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
    
    LocalDateTime agora = LocalDateTime.now();

    System.out.println(proximaCopa.format(format));
    System.out.println(agora.format(formatHora));
  
    LocalTime localTime = LocalTime.of(15, 30);
    System.out.println(localTime);
  }
}
