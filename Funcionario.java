abstract public class Funcionario {
    private String matricula;
    private String nome;

    public Funcionario(String matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;

    }

    public String getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public double ganhosF() {
        return 1.212;
    }

    public String toString() {
        return "Nome -->" + getNome() + " com a matricula --> " + getMatricula() +
                " e com ganhos -->" + ganhosF();
    }
}
