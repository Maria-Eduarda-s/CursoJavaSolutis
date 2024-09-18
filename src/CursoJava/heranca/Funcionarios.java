package CursoJava.heranca;

import CursoJava.heranca.model.business.Empregado;
import CursoJava.heranca.model.business.Fornecedor;
import CursoJava.heranca.model.staff.Administrador;
import CursoJava.heranca.model.staff.Operario;
import CursoJava.heranca.model.staff.Vendedor;

public class Funcionarios {
    public static void main(String[] args) {

        Fornecedor fornecedor1 = new Fornecedor("João", "Rua 12 Casa 20",
                "3322-1111", 2000, 1000);

        Empregado empregado1 = new Empregado("Carol", "Rua 34 Casa 76", "3388-7989",
                11233, 1569, 7.5);

        Administrador administrador1 = new Administrador("Junior", "Rua Castelo Azul Casa 55",
                "9988-7654", 12343, 1580, 7.5, 120);

        Operario operario1 = new Operario("Henrique", "Vila Por do Sol Rua 12 Casa 02", "9564-0891",
                93215, 2056,7.5,1500,5);

        Vendedor vendedor1 = new Vendedor("Fernando", "Rua 37 Casa 09", "9966-1234",
                99342, 1700, 7.5, 20000, 5);

        System.out.println(fornecedor1);
        System.out.println(empregado1);
        System.out.println(administrador1);
        System.out.println(operario1);
        System.out.println(vendedor1);
    }
}
