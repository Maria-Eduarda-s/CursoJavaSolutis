package CursoJava.herancapolimorfismo.empresa;

public class Gerente extends Comissao {
    protected double valorGerente = 1500;

    @Override
    public double adicionalComissao() {
        return valorGerente;
    }

    @Override
    public String descricaoComissao() {
        return "Gerente";
    }
}
