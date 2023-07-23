package dataHora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program
{
    public static void main(String[] args)
    {
        LocalDate d01           = LocalDate.now(); // Dia mes e ano
        LocalDateTime d02       = LocalDateTime.now(); // Dia, mes, ano e horas - Não considera o fuso horário de londres
        Instant d03             = Instant.now(); // Dia, mes, ano e horas - Padrão GMT londres
        LocalDate d04           = LocalDate.parse("2023-07-20");
        LocalDateTime d05       = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06             = Instant.parse("2022-07-20T01:30:26Z");
        Instant d07             = Instant.parse("2022-07-20T01:30:26-03:00");
        DateTimeFormatter fmt1  = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate d08           = LocalDate.parse("20/07/2023", fmt1);
        LocalDate d09           = LocalDate.of(2022, 7, 20);
        LocalDateTime d10       = LocalDateTime.of(2023, 7, 23, 1, 30);

        System.out.println("d01 = " + d01);
        System.out.println("d02 = " + d02);
        System.out.println("d03 = " + d03);
        System.out.println("d04 = " + d04);
        System.out.println("d05 = " + d05);
        System.out.println("d06 = " + d06);
        System.out.println("d07 = " + d07);
        System.out.println("d08 = " + d08);
        System.out.println("d09 = " + d09);
        System.out.println("d10 = " + d10);
    }
}
