package CursoJava.list4.abstracts;

public abstract class AnimalMarinhoAB extends AnimalAB{

    protected float animalNada;

    public AnimalMarinhoAB(String nome, String tipoAnimal, String habitat, String uninadadeMedidaComida,
                           String uninadadeMedidaCaminho, int idade, int peso, int altura, float comidaIngerida,
                           int caminhoPercorrido, int horasSono) {
        super(nome, tipoAnimal, habitat, uninadadeMedidaComida, uninadadeMedidaCaminho, idade, peso, altura,
                comidaIngerida, caminhoPercorrido, horasSono);
        this.animalNada = animalNada;
    }

    public float getAnimalNada() {
        return animalNada;
    }

    public void setAnimalNada(float animalNada) {
        this.animalNada = animalNada;
    }

    public void nadar(float animalNada){
        this.animalNada = animalNada;
        System.out.println("O animal consegue nadar " + animalNada + "m");
    }
}
