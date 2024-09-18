package CursoJava.list2;

/*3. Crie uma classe e na função main() implemente um programa que lê um
número inteiro do teclado e imprime todos os números primos menores que ele
(divisíveis por 1 ou por ele mesmo).
 */

import java.util.Scanner;

public class Quest3 {

    public static void run(Scanner sc){

        System.out.println("Este programa irá descobrir se os números menores que o inserido, é primo.");
        System.out.println("Digite um valor:");
        int number = sc.nextInt();

        NumberPrime(number);
    }

    public static void NumberPrime(int number) {

        for (int i = 2; i < number; i++) {
            if (isPrime(i)) {
                System.out.println(i + " é um número primo.");
            }
        }
    }

    public static boolean isPrime(int number) {
        if (number < 1) {
            return false;
        }

        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}