package CursoJava.list2;

/*10. Escreva uma classe que conte a quantidade de vogais, espaços em brancos e consoantes de uma
cadeia de caracteres.
 */

import java.util.Scanner;

public class Quest10 {

    public static void run(Scanner sc){

        System.out.println("O programa irá analisar uma frase, mostrando suas vogais, consoantes e espaços em branco.");

        String testPharse = "Hello, world!";
        CountCharacter.Count(testPharse);

        char answer;
        String userPhrase;

        while (true) {
            System.out.println("Gostaria de inserir uma frase para verificar? y/n");
            answer = sc.next().charAt(0);
            sc.nextLine();
            switch (Character.toLowerCase(answer)) {
                case 'y':
                    System.out.println("Digite a frase:");
                    userPhrase = sc.nextLine();
                    CountCharacter.Count(userPhrase);
                    break;
                case 'n':
                    System.out.println("programa finalizado.");
                    return;
                default:
                    System.out.println("Resposta inválida. Por favor, insira novamente");
                    break;
            }
        }
    }
}

class CountCharacter {

    public static void Count(String userPharse){
        int countVowel = 0;
        int countConsonant = 0;
        int countSpace = 0;
        char[] vowel = new char[]{'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U', 'á', 'à', 'â', 'ã', 'é',
                'è', 'ê', 'ì', 'í', 'î', 'ò', 'ó', 'ô', 'õ', 'ù', 'ú', 'û', 'Á', 'À', 'Â', 'Ã', 'É', 'È',
                'Ê', 'Ì', 'Í', 'Î', 'Ò', 'Ó', 'Ô', 'Õ', 'Ù', 'Ú', 'Û'};
        char[] consonant = new char[]{'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r',
                's', 't', 'v', 'w', 'x', 'y', 'z', 'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N',
                'P', 'Q', 'R', 'S', 'T', 'V', 'W', 'X', 'Y', 'Z'};

        for(int i = 0; i < userPharse.length(); i++){
            char character = userPharse.charAt(i);

            if(iterateArray(character, vowel)){
                countVowel++;
            }else if(iterateArray(character, consonant)){
                countConsonant++;
            }else if(Character.isWhitespace(character)){
                countSpace++;
            }
        }
        System.out.println(userPharse + " = Contém "+ countVowel + " vogais, " + countConsonant + " consoantes e " + countSpace + " espaços.");
    }

    public static boolean iterateArray(char character, char[] array) {
        for (char c : array) {
            if (c == character) {
                 return true;
            }
        }
    return false;
    }
}