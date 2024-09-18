package CursoJava.list3;

import java.math.BigInteger;

public class Q52RiceCalculation {

    public static void main(String[] args){

        BigInteger totalGrains = BigInteger.ZERO;
        BigInteger calculateGrains = BigInteger.ONE;

        for (int i = 1; i <= 64; i++) {
            totalGrains = totalGrains.add(calculateGrains);
            calculateGrains = calculateGrains.multiply(BigInteger.valueOf(2));
        }
        System.out.println("Total de grãos de arroz: " + totalGrains);

    //grainsSack1kg valor baseado em pesquisa na internet, 1kg de arroz equivale ≅ 50000 grãos.
       BigInteger grainsSack1kg= BigInteger.valueOf(50000);
       BigInteger[] result = totalGrains.divideAndRemainder(grainsSack1kg);
       BigInteger sacksRequired = result[0];

        if (!result[1].equals(BigInteger.ZERO)) {
            sacksRequired = sacksRequired.add(BigInteger.ONE);
        }
        System.out.println("Quantidade de sacos de arroz necessários: " + sacksRequired);
    }
}