package CursoJava.list3;

import java.util.Scanner;

public class Q29RectangleProperties {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

       double x1 = sc.nextDouble();
       double y1 = sc.nextDouble();
       double x2 = sc.nextDouble();
       double y2 = sc.nextDouble();
       double rectangleArea;
       double newPointX;
       double newPointY;

        if(x1 < x2 && y1 > y2){
            System.out.println("Forma um retângulo.");
            rectangleArea = (x2 - x1) * (y1 - y2);
            System.out.println("A área do retângulo é = " + rectangleArea);
        }else if(y1 == y2 && x1 != x2) {
            System.out.println("Forma uma reta horizontal.");
            return;
        }else if (x1 == x2 && y1 != y2) {
            System.out.println("Forma uma reta vertical.");
            return;
        }else if (x1 == x2 && y1 == y2){
            System.out.println("Os dois pontos representam o mesmo ponto.");
            return;
        }else{
            System.out.println("Os pontos fornecidos não formam uma figura válida.");
            return;
        }


        newPointX = sc.nextDouble();
        newPointY = sc.nextDouble();

        if (newPointX < x1 && newPointY > y1) {
            System.out.println("Acima e à esquerda.");
        } else if (newPointX >= x1 && newPointX <= x2 && newPointY > y1) {
            System.out.println("Acima.");
        } else if (newPointX > x2 && newPointY > y1) {
            System.out.println("Acima e à direita.");
        } else if (newPointX < x1 && newPointY >= y2 && newPointY <= y1) {
            System.out.println("À esquerda.");
        } else if (newPointX > x2 && newPointY >= y2 && newPointY <= y1) {
            System.out.println("À direita.");
        } else if (newPointX < x1 && newPointY < y2) {
            System.out.println("Embaixo e à esquerda.");
        } else if (newPointX >= x1 && newPointX <= x2 && newPointY < y2) {
            System.out.println("Embaixo.");
        } else if (newPointX > x2 && newPointY < y2) {
            System.out.println("Embaixo e à direita.");
        } else if (newPointX >= x1 && newPointX <= x2 && newPointY >= y2 && newPointY <= y1) {
            System.out.println("Dentro do retângulo.");
        } else {
            System.out.println("Na linha do retângulo.");
        }
        sc.close();
    }
}