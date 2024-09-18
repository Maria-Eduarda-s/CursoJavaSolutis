package CursoJava.herancapolimorfismo.zoo.tiposanimais;

import CursoJava.herancapolimorfismo.zoo.Animal;

public class Leao extends Animal {

    public Leao(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("O leão " + nome + " está rugindo.");
    }

    @Override
    public void correr() {
        System.out.println(nome + " está correndo.");
    }
}