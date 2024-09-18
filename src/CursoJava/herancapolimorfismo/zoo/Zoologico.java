package CursoJava.herancapolimorfismo.zoo;

import CursoJava.herancapolimorfismo.zoo.tiposanimais.*;
import CursoJava.herancapolimorfismo.zoo.veterinario.Veterinario;

public class Zoologico {

    protected Animal[] jaula = new Animal[10];


    public Zoologico(){

        jaula[0] = new Cachorro("Totó", 3);
        jaula[1] = new Cavalo("Corredor", 12);
        jaula[2] = new Chimpanze("Cesar", 20);
        jaula[3] = new Chita("Nina", 14);
        jaula[4] = new Coelho("Fofucho", 1);
        jaula[5] = new Hiena("Risonha", 11);
        jaula[6] = new Leao("Rei", 10);
        jaula[7] = new Preguica("Neném", 8);
        jaula[8] = new Raposa("Vulpes", 3);
        jaula[9] = new Vaca("Malhada", 5);
    }

    public void mostrarAnimais(){

        for(Animal animal : jaula){
            if(animal != null){
                animal.emitirSom();
                animal.correr();
                if(animal instanceof Preguica){
                    Preguica preguica = (Preguica) animal;
                    preguica.subirArvore();
                }
            }
        }
    }
    public static void main(String[] args) {

        Veterinario veterinario = new Veterinario();
        Zoologico zoologico = new Zoologico();

        Animal cachorro = new Cachorro("Totó", 3);
        Animal cavalo = new Cavalo("Corredor", 12);
        Animal preguica = new Preguica("Neném", 8);

        veterinario.examinar(cachorro);
        veterinario.examinar(cavalo);
        veterinario.examinar(preguica);

        zoologico.mostrarAnimais();
    }
}