package CursoJava.herancapolimorfismo.empresa;

public class Vendedor extends Comissao {
    protected double valorVendedor = 250;

    @Override
    public double adicionalComissao() {
        return valorVendedor;
    }

    @Override
    public String descricaoComissao() {
        return "Vendedor";
    }
}