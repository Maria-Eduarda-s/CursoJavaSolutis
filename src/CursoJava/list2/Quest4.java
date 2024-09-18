package CursoJava.list2;

/*4. Pretende-se escrever um programa que leia do teclado uma distância expressa em milhas,
converte-a para quilômetros e apresenta o resultado no console.
(fórmula de conversão: 1 milha = 1.609 km).
 */

import java.util.Scanner;

public class Quest4 {

    public static void run(Scanner sc){

        System.out.println("O programa vai converter milhas em quilômetros.");
        System.out.println("Insira o valor em milhas:");
        double mile = sc.nextDouble();
        double kilometers = mile * 1.609;
        System.out.printf("Conversão de milha para quilômetros: %.2f km%n", kilometers);

    }
}