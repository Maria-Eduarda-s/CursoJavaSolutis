package CursoJava.list2;

/*12. Os motoristas se preocupam com a quilometragem obtida por seus automóveis. Um motorista
monitorou vários tanques cheios de gasolina registrando a quilometragem dirigida e a quantidade
de combustível em litros utilizados para cada tanque cheio. Desenvolva um aplicativo Java que
receba como entrada os quilômetros dirigidos e os litros de gasolina consumidos (ambos com inteiros)
para cada tanque cheio. O programa deve calcular e exibir o consumo em quilômetros/litro para cada
tanque cheio e imprimir a quilometragem combinada e a soma total de litros de combustível consumidos
até esse ponto. Todos os cálculos de média devem produzir resultados de ponto flutuante.
 */

import java.util.Scanner;

public class Quest12 {

    public static void run(Scanner sc){

        int km = 0;
        int gasoline = 0;
        int kmTotal = 0;
        int gasolineTotal = 0;
        char moreCars;

        System.out.println("Este programa irá fornecer a quilometragem combinada, soma total de litros de " +
                "combustível consumidos e o consumo médio total inseridos pelo usuário.");

        do{
            System.out.println("Digite a quilometragem dirigida:");
            km = sc.nextInt();

            System.out.println("Digite a quantidade de combustível consumido:");
            gasoline = sc.nextInt();

            double calculateConsuption = (double) km / gasoline;
            System.out.printf("Consumo do tanque informado : %.2f km/l.\n", calculateConsuption);

            kmTotal += km;
            gasolineTotal += gasoline;

            System.out.println("Calcular outro tanque? (y/n)");
            moreCars = sc.next().charAt(0);

        }while(moreCars == 'y' || moreCars == 'Y');

        double calculateAllConsuption = (double) kmTotal / gasolineTotal;

        System.out.println("A quilometragem combinada é: " + kmTotal + " km");
        System.out.println("A soma total de litros de combustível consumidos é: " + gasolineTotal + " litros");
        System.out.println("O consumo médio total é: " + calculateAllConsuption);

    }
}