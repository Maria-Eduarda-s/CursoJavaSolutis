package CursoJava.list3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Q58SumDate {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate date = null;
        LocalDate newDate = null;
        int daysToAdd;

        System.out.println("Digite uma data (dd/MM/yyyy):");
        date = LocalDate.parse(sc.nextLine(), formatter);

        System.out.println("Digite os dias:");
        daysToAdd = sc.nextInt();

        //adicionando os dias
        newDate = date.plusDays(daysToAdd);

        System.out.println(date.format(formatter) + " + " + daysToAdd + " = " + newDate.format(formatter));

        sc.close();
    }
}