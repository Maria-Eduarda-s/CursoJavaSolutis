package CursoJava.list2;

/*2. Faça um programa que receba 2 valores e retorne o maior entre eles.
 */

import java.util.Scanner;

public class Quest2 {

    public static void run(Scanner sc){

        System.out.println("Este programa irá descobrir qual valor é maior.");
        System.out.println("Digite um valor:");
        int number1 = sc.nextInt();
        System.out.println("Digite um valor:");
        int number2 = sc.nextInt();

        if(number1 > number2){
            System.out.println(number1 + " é o maior valor.");
        }else{
            System.out.println(number2 + " é o maior valor.");
        }
    }
}