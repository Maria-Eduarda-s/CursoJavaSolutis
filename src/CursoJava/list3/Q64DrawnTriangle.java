package CursoJava.list3;

import java.util.Scanner;

public class Q64DrawnTriangle {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um valor para desenhar uma sequência de triângulos:");
        int numberOfTriangle = sc.nextInt();

        for(int i = 0; i <= numberOfTriangle; i++){
            for(int j = 0; j <= i; j++){
                for (int k = 1; k <= j; k++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}