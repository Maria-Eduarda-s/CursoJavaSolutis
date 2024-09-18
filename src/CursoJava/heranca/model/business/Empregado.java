package CursoJava.heranca.model.business;

import CursoJava.heranca.model.Pessoa;
import java.text.NumberFormat;

public class Empregado extends Pessoa {

    protected int codigoSetor;
    protected double salarioBase;
    protected double imposto;

    public Empregado(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto) {
        super(nome, endereco, telefone);
        this.codigoSetor = codigoSetor;
        this.salarioBase = salarioBase;
        this.imposto = imposto;
    }

    public int getCodigoSetor() {
        return codigoSetor;
    }

    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    public double calcularSalario(){
        double resultadoValorImposto = salarioBase * (imposto / 100);
        return salarioBase - resultadoValorImposto;
    }

    @Override
    public String toString() {
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
        return super.toString() +
                "\n\tValor salário base: " + currencyFormat.format(salarioBase) +
                "\n\tPorcentagem de imposto: " + imposto + "%" +
                "\n\tSalário: " + currencyFormat.format(calcularSalario());
    }
}