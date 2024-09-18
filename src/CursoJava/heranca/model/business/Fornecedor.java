package CursoJava.heranca.model.business;

import CursoJava.heranca.model.Pessoa;
import java.text.NumberFormat;

public class Fornecedor extends Pessoa {

    private double valorCredito;
    private double valorDivida;

    public Fornecedor(String nome, String endereco, String telefone, double valorCredito, double valorDivida) {
        super(nome, endereco, telefone);
        this.valorCredito = valorCredito;
        this.valorDivida = valorDivida;
    }

    public double getValorCredito() {
        return valorCredito;
    }

    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }

    public double obterSaldo(){
        double saldo = valorCredito - valorDivida;
        return saldo;
    }

    @Override
    public String toString() {
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();
        return super.toString() +
                "\n\tValor Crédito: " + currencyFormat.format(valorCredito) +
                "\n\tValor Dívida: " + currencyFormat.format(valorDivida) +
                "\n\tSaldo: " + currencyFormat.format(obterSaldo());
    }

}