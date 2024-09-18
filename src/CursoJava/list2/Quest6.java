package CursoJava.list2;

/*6.Imprima produto dos números de ímpares de 15 a 30, usando os tipos de dados int e float.
 */

public class Quest6 {

    public static void run(){

        long product = 1;
        for(int i = 15; i <= 30; i++){
            if(i % 2 != 0){
                product *= i;
            }
        }
        System.out.printf("O programa mostrará o produto dos números ímpares de 15 a 30 int: %d | float: %.2f\n", (int)product, (float)product);

        //Conforme visto, a operação entre os números ímpares de 15 a 30 com tipos int e float resultaram em um overflow.
        // Para mostrar o real resultado são necessários tipos long e double, pois seus armazenamentos são maiores.
        System.out.printf("Produto dos números ímpares de 15 a 30 long: %d | double: %.2f\n", product, (double)product);
    }
}