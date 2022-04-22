
public class FuncionarioComissionado extends Funcionario {
    private int quantidadeVendas;
    private double valorPorVendas;

    public FuncionarioComissionado(String matricula, String nome, int quantidadeVendas,
            double valorPorVendas) {
        super(matricula, nome);
        this.quantidadeVendas = quantidadeVendas;
        this.valorPorVendas = valorPorVendas;
    }

    public int getQuantidadeVendas() {
        return quantidadeVendas;
    }

    public void setQuantidadeVendas(int quantidadeVendas) {
        this.quantidadeVendas = quantidadeVendas;
    }

    public void setValorPorVendas(double valorPorVendas) {
        this.valorPorVendas = valorPorVendas;
    }

    public double getValorPorVendas() {
        return valorPorVendas;
    }

    public double ganhosFC() {
        return super.ganhosF() + (quantidadeVendas * valorPorVendas);
    }

    public String toString() {
        return "O funcionario comissionado com o nome: " + super.getNome() +
                " com a matricula: " + super.getMatricula() + " com a quantidade de vendas --> " +
                getQuantidadeVendas() + ", valor por vendas " + getValorPorVendas() +
                " e com o ganho de R$ " + ganhosFC();
    }

    // private double comissao; // custo por unidade
    // private int vendas; // controle do número de unidades vendidas

    // public FuncionarioComissionado(String primeiro_nome, String segundo_nome,
    // double salario, double comissao) {
    // super(primeiro_nome, segundo_nome, salario); // chamando o construtor para
    // // inicializar as var corretamente

    // this.comissao = comissao;
    // }

    // public double calcularSalario() {
    // return getSalario() + (comissao * vendas);
    // }

    // public void addVendas(int vendas) {
    // this.vendas = this.vendas + vendas;
    // }

    // public void redefinirVendas() {
    // vendas = 0;
    // }

    // public String toString(){
    // return super.toString()+ " " + super.toString();
    // }

}
