package CursoJava.list4.contracts;
import CursoJava.list4.abstracts.AnimalVoadorAB;

public class Pombo extends AnimalVoadorAB {

    public Pombo(String nome, String tipoAnimal, String habitat, String uninadadeMedidaComida,
                 String uninadadeMedidaCaminho, int idade, int peso, int altura, float comidaIngerida,
                 int caminhoPercorrido, int horasSono) {
        super(nome, tipoAnimal, habitat, uninadadeMedidaComida, uninadadeMedidaCaminho, idade, peso, altura,
                comidaIngerida, caminhoPercorrido, horasSono);
    }
}