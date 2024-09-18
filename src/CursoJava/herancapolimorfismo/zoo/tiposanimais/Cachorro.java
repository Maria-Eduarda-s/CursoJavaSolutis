package CursoJava.herancapolimorfismo.zoo.tiposanimais;

import CursoJava.herancapolimorfismo.zoo.Animal;

public class Cachorro extends Animal {

    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("O cachorro " + nome + " está latindo.");
    }

    @Override
    public void correr(){
        System.out.println(nome + " está correndo.");
    }
}