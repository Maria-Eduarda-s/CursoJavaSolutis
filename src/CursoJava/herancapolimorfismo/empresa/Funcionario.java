package CursoJava.herancapolimorfismo.empresa;

public class Funcionario extends RegistroAcademico {

    private double salario;
    private String cargo;
    private Comissao comissao;

    public Funcionario(String nome, int codigoFuncional, String escolaBasico, String escolaMedio, String universidade, double salario) {
        super(nome, codigoFuncional, escolaBasico, escolaMedio, universidade);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setComissao(Comissao comissao) {
        this.comissao = comissao;
    }

    public double rendaTotal() {
        double rendaTotal = 1000; // Renda básica inicial

        if (getEscolaBasico() != null) {
            rendaTotal += rendaTotal * 0.10; // 10% de aumento com o ensino básico
        }
        if (getEscolaMedio() != null) {
            rendaTotal += rendaTotal * 0.50; // 50% de aumento com o ensino médio
        }
        if (getUniversidade() != null) {
            rendaTotal += rendaTotal * 1.00; // 100% de aumento com a graduação
        }

        if (comissao != null) {
            rendaTotal += comissao.adicionalComissao();
        }

        return rendaTotal;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() +
                ", Código Funcional: " + getCodigoFuncional() +
                ", Cargo: " + cargo +
                ", Renda Total: R$" + rendaTotal();
    }
}