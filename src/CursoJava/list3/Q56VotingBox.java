package CursoJava.list3;

import java.util.Scanner;

public class Q56VotingBox {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o nome dos 3 candidatos:");
        String candidate1Name = sc.nextLine();
        String candidate2Name = sc.nextLine();
        String candidate3Name = sc.nextLine();

        int candidate1Vote = 0;
        int candidate2Vote = 0;
        int candidate3Vote = 0;
        int whiteVote = 0;
        int totalVote = 0;
        String vote;
        String winner;

        while(true){
            System.out.println("Insira o nome do candidato que deseja votar. Para finalizar, escreva fim");
            vote = sc.nextLine();

            if(vote.equals("fim")){
                break;
            }

            totalVote++;

            if(vote.equalsIgnoreCase(candidate1Name)){
                candidate1Vote++;

            } else if(vote.equalsIgnoreCase(candidate2Name)){
                candidate2Vote++;

            } else if(vote.equalsIgnoreCase(candidate3Name)){
                candidate3Vote++;

            }else if(vote.equalsIgnoreCase("branco")){
                whiteVote++;
            }else{
                System.out.println("Voto inválido.");
                totalVote--;
            }
        }

        if(candidate1Vote > candidate2Vote && candidate1Vote > candidate3Vote){
            winner = candidate1Name;
        }else if(candidate2Vote > candidate1Vote && candidate2Vote > candidate3Vote){
            winner = candidate2Name;
        }else if(candidate3Vote > candidate1Vote && candidate3Vote > candidate2Vote){
            winner = candidate3Name;
        }else{
            winner = "ninguém";
        }

        System.out.printf("Candidato: %s, quantidade de votos: %d, percentual de votos: %.2f%%\n",
                candidate1Name, candidate1Vote, (candidate1Vote * 100.0 / totalVote));
        System.out.printf("Candidato: %s, quantidade de votos: %d, percentual de votos: %.2f%%\n",
                candidate2Name, candidate2Vote, (candidate2Vote * 100.0 / totalVote));
        System.out.printf("Candidato: %s, quantidade de votos: %d, percentual de votos: %.2f%%\n",
                candidate3Name, candidate3Vote, (candidate3Vote * 100.0 / totalVote));
        System.out.printf("Votos em branco: quantidade de votos: %d, percentual de votos: %.2f%%\n",
                whiteVote, (whiteVote * 100.0 / totalVote));

        System.out.println("O ganhador foi: " + winner);

        sc.close();
    }
}