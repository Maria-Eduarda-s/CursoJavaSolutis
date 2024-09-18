package CursoJava.herancapolimorfismo.zoo.tiposanimais;

import CursoJava.herancapolimorfismo.zoo.Animal;

public class Vaca extends Animal {

    public Vaca(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("A vaca " + nome + " está berrando.");
    }
}