package CursoJava.list2;

/*8. Criar uma classe Java que receba uma palavra (String) retorne uma mensagem caso a
palavra fornecida seja uma palavra que pode ser lida da esquerda pra direita ou da direita
pra esquerda obtendo-se a mesma palavra. Ex.: Ana, arara, osso, etc.
 */

import java.util.Scanner;

public class Quest8 {

    public static void run(Scanner sc){

        sc.nextLine();
        System.out.println("Este programa mostra se uma palavra pode ser lida de trás para frente.");
        System.out.println("Digite uma palavra:");
        String word = sc.nextLine();

        if (word.isEmpty()) {
            System.out.println("Nenhuma palavra digitada.");
            return;
        }

        StringBuilder sb = new StringBuilder(word);
        sb.reverse();
        String wordInverse = sb.toString();

        if(word.equalsIgnoreCase(wordInverse)){
            System.out.println("Essa palavra pode ser lida de trás para frente.");
        }else{
            System.out.println("Essa palavra não pode ser lida de trás para frente.");
        }
    }
}