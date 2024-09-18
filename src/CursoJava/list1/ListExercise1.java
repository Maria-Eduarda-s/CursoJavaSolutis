package CursoJava.list1;

/*1. O que são variáveis locais?
Variáveis locais são declaradas dentro de um bloco de código, e podem armazenam valores
de diferentes tipos, como números, textos, caracteres e valores booleanos (true ou false).
O escopo de uma variável local é restrito ao bloco em que ela é declarada, isso significa
que ela só pode ser acessada dentro desse bloco e não pode ser utilizada fora dele. Se uma
variável local for declarada dentro de um método, por exemplo, ela só estará disponível
dentro desse método. Após o término da execução do bloco, a variável é descartada e a memória que
ela utilizava é liberada. Uma variável local deve ser inicializada antes de ser usada, caso não
o faça, o código não compilará.

2. Quais os tipos de dados primitivos da linguagem Java?
Na linguagem Java, existem 8 tipos de dados primitivos, cada um destinado a armazenar um tipo
específico de dado com um tamanho fixo. São eles: byte, short, int, long, float, double,
boolean e char. Os tipos que armazenam números inteiros e suas respectivas margens de armazenamento
são: byte (-128 a 127), short (-32.768 a 32.767), int (-2.147.483.648 a 2.147.483.647) e long
(-9.223.372.036.854.775.808 a 9.223.372.036.854.775.807). Os tipos de ponto flutuante armazenam números
decimais, sendo suas faixas de valores aproximadas:  float(3,4e-038 a 3,4e+038) e double(1,7e-308 a 1,7e+308).
O tipo boolean define valores lógicos, sendo true ou false. Já o tipo char é utilizado para armazenar um
único caracter, que pode ser uma letra, número ou símbolo, não podendo armazenar um valor vazio.

3. O que são *bytecodes*?
Os bytecodes são instruções geradas pelo compilador Java (javac) e armazenadas em arquivos .class.
Esses bytecodes são executados pela Máquina Virtual Java (JVM), que os interpreta ou compila em código de
máquina. Os arquivos .class podem ser encontrados no diretório de saída.

4. O que é uma referência?
Uma referência é o endereço no qual é apontado a localização de um objeto na memória. Após declarar uma variável,
seja ela uma String ou Array, ela não será armazenado diretamente no objeto, mas sim o endereço no qual o objeto
está armazenado na memória. Esse processo permite o acesso e a manipulação de maneira que não seja necessário
duplicar na memória.

5. O que é *Garbage Collection*?
Garbage Collection é o processo de gerenciamento automático de memória que remove objetos que não são mais acessíveis,
que não possuem referências ativas. Quando um objeto não tem mais uso, é feita a liberação da memória que o mesmo estava
ocupando, fazendo com que o sistema fique mais otimizado.

6. Qual a necessidade de adotar um padrão de codificação?
Seguir um padrão de codificação é fundamental para manter a clareza e a consistência no código, facilitando a leitura
e a manutenção por outros desenvolvedores. As boas práticas como indentação, uso de comentários, padronização de
nomenclaturas entre outras medidas, ajudam a evitar erros, ajudando a melhorar a eficiência dentro da equipe.

7.Ler dois valores para as variáveis A e B, efetuar a troca dos valores de
forma que a variável A passe a possuir o valor da variável B e que a variável B
passe a possuir o valor da variável A. Apresentar os valores trocados.

8. Escreva uma classe que verifica se um dado número inteiro é par ou ímpar.

9. Encontre o quadrado dos números de 0 até 10. Utilize o controle de fluxo for.

10. Faça um programa com 3 variáveis do tipo inteiro (int) tal que a primeira
tenha o valor de 6, a segunda o valor 4 e a terceira receba o valor da divisão da
primeira pela segunda. Exiba o valor da terceira variável. Faça uma análise do
resultado.

11. Utilize a estrutura if para fazer um programa que retorne o nome de um
produto a partir do código do mesmo. Considere os seguintes códigos:
001 ? Parafuso;
002 ? Porca;
003 ? Prego;
Para qualquer outro código: XXX ? Diversos.

12. Imprima o resultado da divisão por 2 de todos os múltiplos de 3, entre 1 e
100, usando os tipos de dados int e double .

13. Escreva uma classe que imprima todas as possibilidades de que no
lançamento de dois dados tenhamos o valor 7 como resultado da soma dos
valores de cada dado.

14. Faça um programa que utilize a estrutura while para ler 50 números e
calcule e exiba a média aritmética deles. (Pesquise sobre como realizar
entrada de dados)

15. Refaça o programa anterior utilizando a estrutura do while.
 */

import java.util.Scanner;

public class ListExercise1 {

    public static void main(String[] args) {

        Scanner  sc= new Scanner(System.in);

        int choice;

        do {
            System.out.println("Escolha qual exercício deseja executar:");
            System.out.println("7. Exercício 7");
            System.out.println("8. Exercício 8");
            System.out.println("9. Exercício 9");
            System.out.println("10. Exercício 10");
            System.out.println("11. Exercício 11");
            System.out.println("12. Exercício 12");
            System.out.println("13. Exercício 13");
            System.out.println("14. Exercício 14");
            System.out.println("15. Exercício 15");
            System.out.println("0. Sair");

            System.out.print("Digite o número do exercício que deseja executar: ");
            choice = sc.nextInt();

            switch (choice) {
                case 7:
                    Exercise7(sc);
                    break;
                case 8:
                    Exercise8(sc);
                    break;
                case 9:
                    Exercise9();
                    break;
                case 10:
                    Exercise10();
                    break;
                case 11:
                    Exercise11(sc);
                    break;
                case 12:
                    Exercise12();
                    break;
                case 13:
                    Exercise13();
                    break;
                case 14:
                    Exercise14(sc);
                    break;
                case 15:
                    Exercise15(sc);
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

    public static void Exercise7(Scanner sc) {

        System.out.println("Leitura de 2 entradas A e B. Ocorrerá a troca entre si de ambas.");
        System.out.println("Digite o valor de A:");
        int A = sc.nextInt();
        System.out.println("Digite o valor de B:");
        int B = sc.nextInt();
        int C = A;
        A = B;
        B = C;

        System.out.println("Valor de A: " + A);
        System.out.println("Valor de B: " + B);
    }

    public static void Exercise8(Scanner sc) {

        System.out.println("leitura de um valor para descobrir se é par ou ímpar.");
        System.out.println("Digite valor:");
        int number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é impar.");
        }
    }

    public static void Exercise9() {

        System.out.println("Quadrado de 0 até 10:");
        int result;

        for (int i = 0; i <= 10; i++) {
            result = i * i;
            System.out.println("número " + i + " ao quadrado: " + result);
        }
    }

    public static void Exercise10() {

        System.out.println("Divisão entre dois valores.");
        int number1 = 6;
        int number2 = 4;
        int number3 = number1 / number2;
        float result = (float) number1 / number2;
        System.out.printf("Valor terceira variável tipo int: %.1f\n", (float) number3);
        System.out.printf("Valor terceira variável tipo float: %.1f\n", result);
        /*Ao dividirmos 6/4 teremos um resultado de 1,5. Por instanciar uma variavel
        do tipo int o valor armazenado será somente 1, devemos fazer um cast para o tipo float,
        obtendo o real resultado.
         */
    }

    public static void Exercise11(Scanner sc) {

        System.out.println("Leitura de um código com retorno do produto ao qual o pertence.");
        System.out.println("Digite o código do produto:");
        sc.nextLine();
        String code = sc.nextLine();

        switch (code) {
            case "001":
                System.out.println("Parafuso");
                break;
            case "002":
                System.out.println("Porca");
                break;
            case "003":
                System.out.println("Prego");
                break;
            default:
                System.out.println("Diversos");
                break;
        }
    }

    public static void Exercise12() {

        System.out.println("Resultado da divisão por 2 de todos os múltiplos de 3 de 1 à 100.");
        for (int i = 0; i <= 33; i++) {
            int multiplesOf3 = 3 * i;
            double result = (double) multiplesOf3 / 2;
            System.out.printf("Multiplicação de 3 por %d = %d, resultado da divisão por 2 = %.2f\n", i, multiplesOf3, result);
        }
    }

    public static void Exercise13() {

        System.out.println("Todas as possibilidades de que dois dados lançados tenham suas faces somadas em resultado 7.");
        int dice1 = 1;
        int dice2 = 6;
        int result;
        int cont = 0;

        for (int i = 0; i < 6; i++) {
            result = dice1 + dice2;
            System.out.println("Valor do dado 1 = " + dice1 + " e valor do dado 2 = " + dice2 + " resultado = " + result);
            cont++;
            dice2--;
            dice1++;
        }
    }

    public static void Exercise14(Scanner sc) {

        System.out.println("Leitura de 50 números e sua média aritmética.");
        int i = 1;
        int cont = 0;
        double result;


        while(i < 51){
            System.out.println("Digite o " + i + "º valor:");
            int number = sc.nextInt();
            cont += number;
            i++;
        }
        result = (double)cont / 50;
        System.out.printf("Média aritmética dos 50 números fornecidos: %.2f\n", result);
    }

    public static void Exercise15(Scanner sc){

        System.out.println("Leitura de 50 números e sua média aritmética.");
        int i = 1;
        int cont = 0;
        double result;


        do{
            System.out.println("Digite o " + i + "º valor:");
            int number = sc.nextInt();
            cont += number;
            i++;
        }while(i < 51);

        result = (double)cont / 50;
        System.out.printf("Média aritmética dos 50 números fornecidos: %.2f\n", result);
    }
}