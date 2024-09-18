package CursoJava.herancapolimorfismo.empresa;

public class RegistroAcademico {

    protected String nome;
    protected int codigoFuncional;
    protected String escolaBasico;
    protected String escolaMedio;
    protected String universidade;

    public RegistroAcademico(String nome, int codigoFuncional, String escolaBasico, String escolaMedio,
                             String universidade) {
        this.nome = nome;
        this.codigoFuncional = codigoFuncional;
        this.escolaBasico = escolaBasico;
        this.escolaMedio = escolaMedio;
        this.universidade = universidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigoFuncional() {
        return codigoFuncional;
    }

    public void setCodigoFuncional(int codigoFuncional) {
        this.codigoFuncional = codigoFuncional;
    }

    public String getEscolaBasico() {
        return escolaBasico;
    }

    public void setEscolaBasico(String escolaBasico) {
        this.escolaBasico = escolaBasico;
    }

    public String getEscolaMedio() {
        return escolaMedio;
    }

    public void setEscolaMedio(String escolaMedio) {
        this.escolaMedio = escolaMedio;
    }

    public String getUniversidade() {
        return universidade;
    }

    public void setUniversidade(String universidade) {
        this.universidade = universidade;
    }
}