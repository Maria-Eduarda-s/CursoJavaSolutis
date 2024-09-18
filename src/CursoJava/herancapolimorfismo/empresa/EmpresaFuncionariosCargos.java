package CursoJava.herancapolimorfismo.empresa;

public class EmpresaFuncionariosCargos {

    private Funcionario[] funcionarios;
    private double custoTotal;
    private double custoEnsinoBasico;
    private double custoEnsinoMedio;
    private double custoUniversidade;

    public EmpresaFuncionariosCargos() {
        funcionarios = new Funcionario[10];

        funcionarios[0] = new Funcionario("Maria", 1, "Ensino Básico", null, null, 1000);
        funcionarios[0].setCargo("Vendedor");
        funcionarios[0].setComissao(new Vendedor());

        funcionarios[1] = new Funcionario("Caio", 2, "Ensino Básico", null, null, 1000);
        funcionarios[1].setCargo("Vendedor");
        funcionarios[1].setComissao(new Vendedor());

        funcionarios[2] = new Funcionario("Jose", 3, "Ensino Básico", null, null, 1000);
        funcionarios[2].setCargo("Vendedor");
        funcionarios[2].setComissao(new Vendedor());

        funcionarios[3] = new Funcionario("Marcela", 4, "Ensino Básico", null, null, 1000);
        funcionarios[3].setCargo("Vendedor");
        funcionarios[3].setComissao(new Vendedor());

        funcionarios[4] = new Funcionario("Joana", 5, "Ensino Básico", "Ensino Médio", null, 1000);
        funcionarios[4].setCargo("Vendedor");
        funcionarios[4].setComissao(new Vendedor());

        funcionarios[5] = new Funcionario("Fernanda", 6, "Ensino Básico", "Ensino Médio", null, 1000);
        funcionarios[5].setCargo("Vendedor");
        funcionarios[5].setComissao(new Vendedor());

        funcionarios[6] = new Funcionario("Saulo", 7, "Ensino Básico", "Ensino Médio", null, 1000);
        funcionarios[6].setCargo("Vendedor");
        funcionarios[6].setComissao(new Vendedor());

        funcionarios[7] = new Funcionario("Paulo", 8, "Ensino Básico", "Ensino Médio", null, 1000);
        funcionarios[7].setCargo("Supervisor");
        funcionarios[7].setComissao(new Supervisor());

        funcionarios[8] = new Funcionario("Jorge", 9, "Ensino Básico", "Ensino Médio", "Universidade", 1000);
        funcionarios[8].setCargo("Supervisor");
        funcionarios[8].setComissao(new Supervisor());

        funcionarios[9] = new Funcionario("Sabrina", 108, "Ensino Básico", "Ensino Médio", "Universidade", 1000);
        funcionarios[9].setCargo("Gerente");
        funcionarios[9].setComissao(new Gerente());
    }

    public void custoEmpresa() {
        for (Funcionario funcionario : funcionarios) {
            double rendaTotal = funcionario.rendaTotal();
            custoTotal += rendaTotal;

            if (funcionario.getUniversidade() != null) {
                custoUniversidade += rendaTotal;
            } else if (funcionario.getEscolaMedio() != null) {
                custoEnsinoMedio += rendaTotal;
            } else if (funcionario.getEscolaBasico() != null) {
                custoEnsinoBasico += rendaTotal;
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Funcionario funcionario : funcionarios) {
            sb.append(funcionario.toString()).append("\n");
        }
        sb.append("Custo total funcionário com ensino básico: R$").append(custoEnsinoBasico).append("\n");
        sb.append("Custo total funcionário com ensino médio: R$").append(custoEnsinoMedio).append("\n");
        sb.append("Custo total funcionário com ensino superior: R$").append(custoUniversidade).append("\n");
        sb.append("Custo total da empresa: R$").append(custoTotal).append("\n");
        return sb.toString();
    }
}