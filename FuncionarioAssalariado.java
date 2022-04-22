public class FuncionarioAssalariado extends Funcionario {
    private double salarioSemanal;

    public FuncionarioAssalariado(String matricula, String nome, double salarioSemanal) {
        super(matricula, nome);
        this.salarioSemanal = salarioSemanal;
    }

    public double getSalarioSemanal() {
        return salarioSemanal;
    }

    public void setSalarioSemanal(double salarioSemanal) {
        this.salarioSemanal = salarioSemanal;
    }

    public double ganhosFA() { // revisar método
        return super.ganhosF() + getSalarioSemanal();
    }

    public String toString() {
        return "Salario semanal do assalariado --> " + getSalarioSemanal() +
                " e com o salario total --> " + ganhosFA();
    }
}