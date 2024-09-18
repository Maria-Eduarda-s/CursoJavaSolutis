package CursoJava.list2;

/*5. Faça um programa que solicite ao usuário um número de 1 a 7, e imprima na tela o dia da
semana correspondente. Suponha que Segunda corresponde a 1 , Terça corresponde a 2, e assim
por diante. Utilizando Array.
 */

import java.util.Scanner;

public class Quest5 {

    public static void run(Scanner sc){

        String[] dayOfWeek = {"Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado", "Domingo"};
        int number;

        System.out.println("Este programa fornecerá o dia da semana de acordo com o número inserido.");
        while(true){
        System.out.println("Insira um valor de 1 a 7:");
        number = sc.nextInt();
            if(number < 1 || number > 7){
                System.out.println("Número inválido. Por favor, Insira um valor de 1 a 7:");
            } else{
                break;
            }
        }
        number--;

        System.out.println(dayOfWeek[number]);

    }
}