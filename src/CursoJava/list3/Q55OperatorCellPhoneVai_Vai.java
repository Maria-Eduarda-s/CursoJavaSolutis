package CursoJava.list3;

import java.util.Scanner;

public class Q55OperatorCellPhoneVai_Vai {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double credit = 50.00;
        int freeMinutes = 100;
        int additionalMinutesVaiVai = 50;
        int totalMinutesUsed = 0;
        int minutes = 0;
        double price = 0.0;
        char callType;

        while (true) {
            System.out.println("Digite o tipo de ligação (o = outras operadoras, v = própria Vai-Vai, f = telefone fixo):");
            callType = sc.next().charAt(0);
            sc.nextLine();
            System.out.println("Digite a quantidade de minutos que deseja usar:");
            minutes = sc.nextInt();

            switch (callType) {
                case 'o':
                    if (totalMinutesUsed + minutes > freeMinutes) {
                        int excessMinutes = totalMinutesUsed + minutes - freeMinutes;
                        price = excessMinutes * 0.65;
                        freeMinutes = 0;
                    } else {
                        freeMinutes -= minutes;
                    }
                    totalMinutesUsed += minutes;
                    break;

                case 'v':
                    if (totalMinutesUsed + minutes > freeMinutes + additionalMinutesVaiVai) {
                        int excessMinutes = totalMinutesUsed + minutes - (freeMinutes + additionalMinutesVaiVai);
                        price = excessMinutes * 0.20;
                        additionalMinutesVaiVai = 0;
                        freeMinutes = 0;
                    } else if (totalMinutesUsed + minutes > freeMinutes) {
                        int remainingMinutes = totalMinutesUsed + minutes - freeMinutes;
                        additionalMinutesVaiVai -= remainingMinutes;
                        freeMinutes = 0;
                    } else {
                        freeMinutes -= minutes;
                    }
                    totalMinutesUsed += minutes;
                    break;

                case 'f':
                    if (totalMinutesUsed + minutes > freeMinutes) {
                        int excessMinutes = totalMinutesUsed + minutes - freeMinutes;
                        price = excessMinutes * 0.325;
                        freeMinutes = 0;
                    } else {
                        freeMinutes -= minutes;
                    }
                    totalMinutesUsed += minutes;
                    break;

                default:
                    System.out.println("Tipo de ligação inválido.");
                    continue;
            }

            credit -= price;

            System.out.printf("Você tem %.2f de saldo.\n", credit);
            System.out.printf("O valor a pagar é: %.2f\n", price);

            int remainingMinutes = freeMinutes + additionalMinutesVaiVai;
            System.out.println("Minutos restantes: " + remainingMinutes);

            System.out.println("Deseja inserir mais ligações? (s/n):");
            char response = sc.next().charAt(0);
            if (response == 'n') {
                break;
            }
        }
        sc.close();
    }
}