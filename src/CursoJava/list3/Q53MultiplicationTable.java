package CursoJava.list3;

import java.util.Scanner;

public class Q53MultiplicationTable {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int numberUser = sc.nextInt();
        int result;

        for(int i = 1; i <= 10; i++){
            result = numberUser * i;
            System.out.println(numberUser + " x " + i + " = " + result);
        }
        sc.close();
    }
}