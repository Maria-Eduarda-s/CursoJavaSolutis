package CursoJava.herancapolimorfismo.zoo.tiposanimais;

import CursoJava.herancapolimorfismo.zoo.Animal;

public class Chita extends Animal {

    public Chita(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("A chita " + nome + " está miando.");
    }

    @Override
    public void correr(){
        System.out.println(nome + " está correndo.");
    }
}