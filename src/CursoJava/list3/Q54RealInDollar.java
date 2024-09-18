package CursoJava.list3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Q54RealInDollar {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        DecimalFormat decimalF = new DecimalFormat("#.00");

        double initialValueReal = sc.nextDouble();
        double finalValueReal = sc.nextDouble();
        double increment = sc.nextDouble();
        double dollar = sc.nextDouble();

        System.out.println("Reais\tDólares");

        for(double real = initialValueReal; real <= finalValueReal; real += increment){
            double realtoDollar = real / dollar;
            System.out.println(decimalF.format(real) + "\t" + decimalF.format(realtoDollar));
        }
        sc.close();
    }
}