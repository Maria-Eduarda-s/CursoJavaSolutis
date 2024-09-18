package CursoJava.heranca.model.staff;

import CursoJava.heranca.model.business.Empregado;
import java.text.NumberFormat;

public class Operario extends Empregado {

    private double valorProducao;
    private double comissao;

    public Operario(String nome, String endereco, String telefone, int codigoSetor, double salarioBase, double imposto,
                    double valorProducao, double comissao) {
        super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
        this.valorProducao = valorProducao;
        this.comissao = comissao;
    }

    public double getValorProducao() {
        return valorProducao;
    }

    public void setValorProducao(double valorProducao) {
        this.valorProducao = valorProducao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public double calcularSalario(){
        double resultadoValorImposto = salarioBase * (imposto / 100);
        double resultadoSalario = salarioBase - resultadoValorImposto;
        double resultadoComissao = valorProducao * (comissao / 100);
        return resultadoSalario + resultadoComissao;
    }

    @Override
    public String toString() {
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
        return super.toString() +
                "\n\tValor de produções: " + currencyFormat.format(valorProducao)+
                "\n\tComissão: " + comissao + "%";
    }
}