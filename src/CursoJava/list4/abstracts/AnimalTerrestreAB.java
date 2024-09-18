package CursoJava.list4.abstracts;

public abstract class AnimalTerrestreAB extends AnimalAB {

    protected int quantidadePatas;
    protected float animalAnda;

    public AnimalTerrestreAB(String nome, String tipoAnimal, String habitat, String uninadadeMedidaComida,
                             String uninadadeMedidaCaminho, int idade, int peso, int altura, float comidaIngerida,
                             int caminhoPercorrido, int horasSono) {
        super(nome, tipoAnimal, habitat, uninadadeMedidaComida, uninadadeMedidaCaminho, idade, peso, altura,
                comidaIngerida, caminhoPercorrido, horasSono);
        this.quantidadePatas = quantidadePatas;
        this.animalAnda = animalAnda;
    }

    public int getQuantidadePatas() {
        return quantidadePatas;
    }

    public void setQuantidadePatas(int quantidadePatas) {
        this.quantidadePatas = quantidadePatas;
    }

    public float getAnimalAnda() {
        return animalAnda;
    }

    public void setAnimalAnda(float animalAnda) {
        this.animalAnda = animalAnda;
    }

    public void andar(float animalAnda){
        this.animalAnda = animalAnda;
        System.out.println("O animal consegue andar " + animalAnda + "m");
    }
    public void quantiaPatas(int quantidadePatas) {
        System.out.println("O animal tem " + quantidadePatas + " patas.");
    }

}