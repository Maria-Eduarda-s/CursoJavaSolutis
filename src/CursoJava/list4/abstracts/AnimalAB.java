package CursoJava.list4.abstracts;
import CursoJava.list4.interfaces.AnimalIF;

import java.time.Duration;

public abstract class AnimalAB implements AnimalIF {


    protected String nome;
    protected String tipoAnimal;
    protected String habitat;
    protected String uninadadeMedidaComida;
    protected String uninadadeMedidaCaminho;
    protected int idade;
    protected int peso;
    protected int altura;
    protected float comidaIngerida;
    protected int caminhoPercorrido;
    protected int horasSono;

    public AnimalAB(String nome, String tipoAnimal, String habitat, String uninadadeMedidaComida,
                    String uninadadeMedidaCaminho, int idade, int peso, int altura, float comidaIngerida,
                    int caminhoPercorrido, int horasSono) {
        this.nome = nome;
        this.tipoAnimal = tipoAnimal;
        this.habitat = habitat;
        this.uninadadeMedidaComida = uninadadeMedidaComida;
        this.uninadadeMedidaCaminho = uninadadeMedidaCaminho;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
        this.comidaIngerida = comidaIngerida;
        this.caminhoPercorrido = caminhoPercorrido;
        this.horasSono = horasSono;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getUninadadeMedidaComida() {
        return uninadadeMedidaComida;
    }

    public void setUninadadeMedidaComida(String uninadadeMedidaComida) {
        this.uninadadeMedidaComida = uninadadeMedidaComida;
    }
    public String getUninadadeMedidaCaminho() {
        return uninadadeMedidaCaminho;
    }

    public void setUninadadeMedidaCaminho(String uninadadeMedidaCaminho) {
        this.uninadadeMedidaCaminho = uninadadeMedidaCaminho;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public float getComidaIngerida() {
        return comidaIngerida;
    }

    public void setComidaIngerida(float comidaIngerida) {
        this.comidaIngerida = comidaIngerida;
    }

    public float getCaminhoPercorrido() {
        return caminhoPercorrido;
    }

    public void setCaminhoPercorrido(int caminhoPercorrido) {
        this.caminhoPercorrido = caminhoPercorrido;
    }

    public float getHorasSono() {
        return horasSono;
    }

    public void setHorasSono(int horasSono) {
        this.horasSono = horasSono;
    }

    @Override
    public void comer(float quantidadeComida) {
        this.comidaIngerida = quantidadeComida;
    }

    @Override
    public void moverse(int distancia) {
        this.caminhoPercorrido = distancia;
    }

    @Override
    public void dormir(int horas) {
        this.horasSono = horas;
    }

    public String tempoSonoFormato(int horasSono){
        long minutos = (horasSono * 60);
        Duration duration = Duration.ofMinutes(minutos);
        long hora = duration.toHours();
        long minutosRestantes = duration.toMinutes() % 60;
        return String.format("%02d:%02d", hora, minutosRestantes);
    }


    public String toString(){
        return "O animal " + nome + " é do tipo " + tipoAnimal + ",\n" +
                " normalmente seu habitat é " + habitat + ",\n" + " sua idade é " +
                idade + ",\n" + " seu peso é " + peso + ",\n" + " sua altura é " +
                altura + "cm,\n" + " a quantidade de comida ingerida é " +
                comidaIngerida + uninadadeMedidaComida + ",\n" + " o caminho percorrido é " +
                caminhoPercorrido + " " + uninadadeMedidaCaminho + ",\n" + " seu tempo de sono é " + tempoSonoFormato(horasSono) + " horas.\n";
    }
}


