package CursoJava.herancapolimorfismo.zoo.tiposanimais;

import CursoJava.herancapolimorfismo.zoo.Animal;

public class Chimpanze extends Animal {
    public Chimpanze(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("O chimpanzé " + nome + " está gritando.");
    }

    @Override
    public void correr(){
        System.out.println(nome + " está correndo.");
    }
}