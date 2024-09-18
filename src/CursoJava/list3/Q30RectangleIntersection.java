package CursoJava.list3;

import java.util.Scanner;

public class Q30RectangleIntersection {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        double[] rect1 = new double[8];
        double[] rect2 = new double[8];

        System.out.println("Digite as coordenadas dos quatro vértices do primeiro retângulo (x y):");
        for (int i = 0; i < 8; i++) {
            rect1[i] = sc.nextDouble();
        }

        System.out.println("Digite as coordenadas dos quatro vértices do segundo retângulo (x y):");
        for (int i = 0; i < 8; i++) {
            rect2[i] = sc.nextDouble();
        }


        double minX1 = Math.min(Math.min(rect1[0], rect1[2]), Math.min(rect1[4], rect1[6]));
        double maxX1 = Math.max(Math.max(rect1[0], rect1[2]), Math.max(rect1[4], rect1[6]));
        double minY1 = Math.min(Math.min(rect1[1], rect1[3]), Math.min(rect1[5], rect1[7]));
        double maxY1 = Math.max(Math.max(rect1[1], rect1[3]), Math.max(rect1[5], rect1[7]));

        double minX2 = Math.min(Math.min(rect2[0], rect2[2]), Math.min(rect2[4], rect2[6]));
        double maxX2 = Math.max(Math.max(rect2[0], rect2[2]), Math.max(rect2[4], rect2[6]));
        double minY2 = Math.min(Math.min(rect2[1], rect2[3]), Math.min(rect2[5], rect2[7]));
        double maxY2 = Math.max(Math.max(rect2[1], rect2[3]), Math.max(rect2[5], rect2[7]));


        if (maxX1 >= minX2 && minX1 <= maxX2 && maxY1 >= minY2 && minY1 <= maxY2) {
            System.out.println("Os retângulos se interceptam.");
        } else {
            System.out.println("Os retângulos não se interceptam.");
        }
        sc.close();
    }
}