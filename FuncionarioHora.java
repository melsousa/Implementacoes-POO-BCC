public class FuncionarioHora extends FuncionarioAssalariado
{
    private int horas;
    private double valorDaHora;

    public FuncionarioHora(String matricula, String nome,
            double salarioSemanal, int horas, double valorDaHora) {
        super(matricula, nome, salarioSemanal);
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public double getValorDaHora() {
        return valorDaHora;
    }

    public void setValorDaHora(double valorDaHora) {
        this.valorDaHora = valorDaHora;
    }

    public double ganhosFH() {
        return getHoras() * getValorDaHora();
    }

    public String toString() {
        return "A quantidade de horas --> " + getHoras()
                + " e o valor das horas são --> " + getValorDaHora() +
                " salario total --> " + ganhosFH();
    }
}