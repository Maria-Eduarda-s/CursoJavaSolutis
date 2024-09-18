package CursoJava.list4.abstracts;

public abstract class AnimalVoadorAB extends  AnimalAB{

    protected int envergaduraAsas;
    protected float animalVoa;

    public AnimalVoadorAB(String nome, String tipoAnimal, String habitat, String uninadadeMedidaComida,
                          String uninadadeMedidaCaminho, int idade, int peso, int altura, float comidaIngerida,
                          int caminhoPercorrido, int horasSono) {
        super(nome, tipoAnimal, habitat, uninadadeMedidaComida, uninadadeMedidaCaminho, idade, peso, altura,
                comidaIngerida, caminhoPercorrido, horasSono);
        this.envergaduraAsas = envergaduraAsas;
    }

    public int getEnvergaduraAsas() {
        return envergaduraAsas;
    }

    public void setEnvergaduraAsas(int envergaduraAsas) {
        this.envergaduraAsas = envergaduraAsas;
    }

    public float getAnimalVoa() {
        return animalVoa;
    }

    public void setAnimalVoa(float animalVoa) {
        this.animalVoa = animalVoa;
    }

    public void voar(float distancia){
        this.animalVoa = distancia;
        System.out.println("O animal consegue voar " + distancia + "metros");
    }
    public void mostrarEnverguraAsas(int envergaduraAsas){
        System.out.println(" A envergadura da asa é " + envergaduraAsas +"cm");
    }
}
