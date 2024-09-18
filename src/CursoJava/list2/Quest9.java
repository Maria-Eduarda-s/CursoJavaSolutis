package CursoJava.list2;

/*9.Escreva uma classe para calcular a área de um círculo, sabendo que a área é A = PI * r2,
onde o raio (r) deve ser informado pelo usuário e o resultado terá que ser arredondado.
 */

import java.util.Scanner;

public class Quest9 {

    public static void run(Scanner sc) {

        System.out.println("Este programa irá calcular a área de um círculo.");
        System.out.println("Digite um valor para o raio do círculo:");
        double radius = sc.nextDouble();

        double areaCircle = Math.PI * (radius * radius);
        System.out.println("A área do circulo com o raio informado é: " + Math.ceil(areaCircle));

    }
}