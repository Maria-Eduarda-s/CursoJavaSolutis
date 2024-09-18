package CursoJava.list2;

/*11. Escreva um programa que tenha duas palavras como entrada, e a saída imprima as palavras em
ordem alfabética (utilize o método compareTo da classe String),. Informe também, qual das palavras
tem o maior número de caracteres.
 */

import java.util.Scanner;

public class Quest11 {

    public static void run(Scanner sc){

        System.out.println("Este programa fará a leitura de duas palavras, coloca elas em ordem alfabética e informa qual é maior/.");
        sc.nextLine();
        System.out.println("Insira a primeira palavra:");
        String word1 = sc.nextLine();
        System.out.println("Insira a segunda palavra:");
        String word2 = sc.nextLine();

        int result = word1.compareTo(word2);

       if(result < 0){
           System.out.println(word1 + " vem primeiro que " + word2);
       }else if(result > 0){
           System.out.println(word2 + " vem primeiro que " + word1);
       }else{
           System.out.println(word1 + "e" + word2 + " são iguais.");
       }

       if(word1.length() > word2.length()){
           System.out.println(word1 + " tem " + word1.length() + " caracteres e " + word2 + " tem "
                   + word2.length() + ", portanto, " + word1 + " é maior.");

       }else if(word1.length() < word2.length()){
           System.out.println(word1 + " tem " + word1.length() + " caracteres e " + word2 + " tem "
                   + word2.length() + ", portanto, " + word2 + " é maior.");
       }else{
           System.out.println("Ambas as palavras tem o mesmo número de caracteres.");
       }

    }
}