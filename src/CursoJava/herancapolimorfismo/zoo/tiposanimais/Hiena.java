package CursoJava.herancapolimorfismo.zoo.tiposanimais;

import CursoJava.herancapolimorfismo.zoo.Animal;

public class Hiena extends Animal {

    public Hiena(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("A hiena " + nome + " está rindo.");
    }

    @Override
    public void correr(){
        System.out.println(nome + " está correndo.");
    }
}