import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDate d01 = LocalDate.now();
        System.out.println(d01);
        LocalDateTime d02 = LocalDateTime.now();
        LocalDate d04 = LocalDate.parse("2022-12-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-12-22T01:30:22");
        Instant d06 = Instant.parse("2022-12-22T01:30:26Z");
        Instant d07 = Instant.parse("2022-12-22T01:30:26-03:00");

        LocalDate d08 = LocalDate.parse("20/12/2022", fmt1);
        LocalDate d09 = LocalDate.parse("20/12/2022 01:30", fmt2);

        System.out.println("d01 = " + d01);
        System.out.println("d02 = " + d02);
        Instant d03 = Instant.now();
        System.out.println("d03 = " + d03);
        System.out.println("d04 = " + d04);
        System.out.println("d05 = " + d05);
        System.out.println("d06 = " + d06);
        System.out.println("d07 = " + d07);
        System.out.println("d08 = " + d08);
        System.out.println("d09 = " + d09);






    }
}