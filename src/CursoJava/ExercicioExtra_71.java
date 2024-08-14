package CursoJava;

/*Dado uma variável x com valor 13, faça um programa que transforme x da
seguinte forma:
se x é par, y=x/2
se x é impar, y=3*x+1
imprime y
neste ponto o programa deve então jogar o valor de y em x e começar tudo de
novo enquanto y seja diferente de 1.
 */

public class ExercicioExtra_71 {
    public static void main(String[] args) {

        int x = 13;
        int y = 0;

        do {
            if (x % 2 == 0){
                y = x / 2;
                x = y;
            }else if(x % 2 == 1){
                y = 3 * x +1 ;
                x = y;
            }
            System.out.println(y);
        } while(y != 1);
    }
}