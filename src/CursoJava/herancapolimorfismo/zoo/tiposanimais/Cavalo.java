package CursoJava.herancapolimorfismo.zoo.tiposanimais;

import CursoJava.herancapolimorfismo.zoo.Animal;

public class Cavalo extends Animal {

    public Cavalo(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("O cavalo " + nome + " está relinchando.");
    }

    @Override
    public void correr(){
        System.out.println(nome + " está correndo.");
    }
}