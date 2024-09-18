package CursoJava.heranca.model.staff;

import CursoJava.heranca.model.business.Empregado;
import java.text.NumberFormat;

public class Administrador extends Empregado {

    private double ajudaDeCusto;

    public Administrador(String nome, String endereco, String telefone, int codigoSetor, double salarioBase,
                         double imposto, double ajudaDeCusto) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.ajudaDeCusto = ajudaDeCusto;
    }

    public double getAjudaDeCusto() {
        return ajudaDeCusto;
    }

    public void setAjudaDeCusto(double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }

    @Override
    public double calcularSalario(){
        double resultadoValorImposto = salarioBase * (imposto / 100);
        double resultadoSalario = salarioBase - resultadoValorImposto;
        return resultadoSalario + ajudaDeCusto;
    }

    @Override
    public String toString() {
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
        return super.toString() +
                "\n\tAjuda de custo: " + currencyFormat.format(ajudaDeCusto);
    }
}