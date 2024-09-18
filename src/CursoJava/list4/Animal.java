package CursoJava.list4;

import CursoJava.list4.contracts.Cachorro;
import CursoJava.list4.contracts.Peixe;
import CursoJava.list4.contracts.Pombo;

public class Animal {

    public static void main(String[] args){

        Cachorro cachorro = new Cachorro("Rukia", "cachorro", "cidades", "g",
                "km",3, 8, 50, 1.3f,5, 12);

        cachorro.andar(20);
        cachorro.quantiaPatas(4);

        System.out.println(cachorro.toString());

        Peixe peixe = new Peixe("Ponyo","peixe", "oceano","g",
                "km", 2, 1, 10,5, 2, 4);

       peixe.nadar(10f);

        System.out.println(peixe.toString());

        Pombo pombo= new Pombo("Pombo", "ave", "áreas hurbanas", "g",
                "km", 4, 300, 30, 100, 4, 12);

        pombo.voar(500);
        pombo.mostrarEnverguraAsas(60);
    }
}
