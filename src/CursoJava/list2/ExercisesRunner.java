package CursoJava.list2;

/*1. Qual a saída do seguinte programa:
class teste {
public static void main( String args[] ){
int i = 5;
int j = i;
j = 10;
System.out.println( "i + j = " + j + i );
}
}
R: A saída será "i + j = 105" A variável i recebe 5, j recebe i = 5. Em seguida,
j recebe 10, na função system houve apenas a concatenação dos valores de i e j,
pois a partir do momento que é inserido aspas(" ") não é realizada mais operações.
Seria necessário introduzir as variáveis entre parênteses.

2. Faça um programa que receba 2 valores e retorne o maior entre eles.

3. Crie uma classe e na função main() implemente um programa que lê um
número inteiro do teclado e imprime todos os números primos menores que ele
(divisíveis por 1 ou por ele mesmo).

4. Pretende-se escrever um programa que leia do teclado uma distância
expressa em milhas, converte-a para quilômetros e apresenta o resultado no
console. (fórmula de conversão: 1 milha = 1.609 km).

5. Faça um programa que solicite ao usuário um número de 1 a 7, e imprima na
tela o dia da semana correspondente. Suponha que Segunda corresponde a 1 ,
Terça corresponde a 2, e assim por diante. Utilizando Array.

6. Imprima produto dos números de ímpares de 15 a 30, usando os tipos de
dados int e float.

7. Imprima o resultado da divisão por 2 de todos os múltiplos de 3, entre 1 e
100, usando os tipos de dados int e double .

8. Criar uma classe Java que receba uma palavra (String) retorne uma
mensagem caso a
palavra fornecida seja uma palavra que pode ser lida da esquerda pra direita
ou da direita pra esquerda obtendo-se a mesma palavra. Ex.: Ana, arara, osso,
etc.

9. Escreva uma classe para calcular a área de um círculo, sabendo que a área
é A = PI * r2, onde o raio (r) deve ser informado pelo usuário e o resultado terá
que ser arredondado.

10. Escreva uma classe que conte a quantidade de vogais, espaços em
brancos e consoantes de uma cadeia de caracteres.

11. Escreva um programa que tenha duas palavras como entrada, e a saída
imprima as palavras em ordem alfabética (utilize o método compareTo da
classe String),. Informe também, qual das palavras tem o maior número de
caracteres.

12. Os motoristas se preocupam com a quilometragem obtida por seus
automóveis. Um motorista monitorou vários tanques cheios de gasolina registrando a
quilometragem dirigida e a quantidade de combustível em litros utilizados para
cada tanque cheio. Desenvolva um aplicativo Java que receba como entrada
os quilômetros dirigidos e os litros de gasolina consumidos (ambos com
inteiros) para cada tanque cheio. O programa deve calcular e exibir o consumo
em quilômetros/litro para cada tanque cheio e imprimir a quilometragem
combinada e a soma total de litros de combustível consumidos até esse ponto.
Todos os cálculos de média devem produzir resultados de ponto flutuante.

 */

import java.util.Scanner;

public class ExercisesRunner {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("Escolha qual questão deseja executar:");
            System.out.println(" 2. Questão 2");
            System.out.println(" 3. Questão 3");
            System.out.println(" 4. Questão 4");
            System.out.println(" 5. Questão 5");
            System.out.println(" 6. Questão 6");
            System.out.println(" 7. Questão 7");
            System.out.println(" 8. Questão 8");
            System.out.println(" 9. Questão 9");
            System.out.println("10. Questão 10");
            System.out.println("11. Questão 11");
            System.out.println("12. Questão 12");
            System.out.println("0. Sair");

            System.out.print("Digite o número da questão que deseja executar: ");
            choice = sc.nextInt();

            switch (choice) {
                case 2:
                    Quest2.run(sc);
                    break;
                case 3:
                    Quest3.run(sc);
                    break;
                case 4:
                    Quest4.run(sc);
                    break;
                case 5:
                    Quest5.run(sc);
                    break;
                case 6:
                    Quest6.run();
                    break;
                case 7:
                    Quest7.run();
                    break;
                case 8:
                    Quest8.run(sc);
                    break;
                case 9:
                    Quest9.run(sc);
                    break;
                case 10:
                    Quest10.run(sc);
                    break;
                case 11:
                    Quest11.run(sc);
                    break;
                case 12:
                    Quest12.run(sc);
                    break;

                case 0:
                    System.out.println("Fechando o programa.");
                    break;
                default:
                    System.out.println("Escolha inválida. Tente novamente.");
            }

            System.out.println();

        } while (choice != 0);

        sc.close();
    }

}