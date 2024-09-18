package CursoJava.list3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Q57CalendarDateCalculator {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate startDate = null;
        LocalDate endDate = null;

        System.out.println("Digite a primeira data (dd/MM/yyyy):");
        startDate = LocalDate.parse(sc.nextLine(), formatter);

        System.out.println("Digite a segunda data (dd/MM/yyyy):");
        endDate = LocalDate.parse(sc.nextLine(), formatter);

        if (startDate.isAfter(endDate)) {
            System.out.println("A primeira data deve ser anterior à segunda data.");
        } else {
            for (LocalDate date = startDate; !date.isAfter(endDate); date = date.plusDays(1)) {
                System.out.println(date.format(formatter));
            }
        }
        sc.close();
    }
}