package CursoJava.herancapolimorfismo.zoo.tiposanimais;

import CursoJava.herancapolimorfismo.zoo.Animal;

public class Raposa extends Animal {

    public Raposa(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("A raposa " + nome + " está uivando.");
    }

    @Override
    public void correr() {
        System.out.println(nome + " está correndo.");
    }
}