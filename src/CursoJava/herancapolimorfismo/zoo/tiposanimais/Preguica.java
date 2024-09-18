package CursoJava.herancapolimorfismo.zoo.tiposanimais;

import CursoJava.herancapolimorfismo.zoo.Animal;

public class Preguica extends Animal {

    public Preguica(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("A preguiça " + nome + " está gritando.");
    }

    public void subirArvore() {
        System.out.println(nome + " está subindo na árvore.");
    }
}