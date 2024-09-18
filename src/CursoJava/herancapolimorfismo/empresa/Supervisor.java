package CursoJava.herancapolimorfismo.empresa;

public class Supervisor extends Comissao {
    protected double valorSupervisor = 600;

    @Override
    public double adicionalComissao() {
        return valorSupervisor;
    }

    @Override
    public String descricaoComissao() {
        return "Supervisor";
    }
}