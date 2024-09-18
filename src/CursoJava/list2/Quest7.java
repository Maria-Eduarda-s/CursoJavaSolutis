package CursoJava.list2;

/*7. Imprima o resultado da divisão por 2 de todos os múltiplos de 3, entre 1 e 100, usando os
tipos de dados int e double .
 */

public class Quest7 {

    public static void run(){

        System.out.println("O programa mostrará o resultado da divisão por 2 de todos os múltiplos de 3 de 1 à 100.");
        for (int i = 0; i <= 33; i++) {
            int multiplesOf3 = 3 * i;
            double result = (double) multiplesOf3 / 2;
            System.out.printf("Multiplicação de 3 por %d = %d, resultado da divisão por 2 = %.2f\n", i, multiplesOf3, result);
        }
    }
}