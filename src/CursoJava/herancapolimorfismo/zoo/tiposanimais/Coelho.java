package CursoJava.herancapolimorfismo.zoo.tiposanimais;

import CursoJava.herancapolimorfismo.zoo.Animal;

public class Coelho extends Animal{

    public Coelho(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("O coelho " + nome + " está chiando.");
    }

    @Override
    public void correr(){
        System.out.println(nome + " está correndo.");
    }
}