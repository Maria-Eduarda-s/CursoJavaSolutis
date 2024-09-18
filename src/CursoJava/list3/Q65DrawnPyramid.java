package CursoJava.list3;

import java.util.Scanner;

public class Q65DrawnPyramid {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira um valor para desenhar uma pirâmide:");
        int line = sc.nextInt();

        for(int i = 1; i <= line; i++){
            for(int j = line; j > i; j--){
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++){
                System.out.print("*");
            }
                System.out.println();
        }
        sc.close();
    }
}