package CursoJava.herancapolimorfismo.zoo.veterinario;

import CursoJava.herancapolimorfismo.zoo.Animal;

public class Veterinario {
    public void examinar(Animal animal){
        System.out.println("O animal " + animal.getNome() + " está sendo examinado.");
        animal.emitirSom();
    }
}