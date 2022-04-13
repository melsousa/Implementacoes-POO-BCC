public class FuncionarioComissionado extends Funcionario {
    private double comissao; // custo por unidade
    private int vendas; // controle do número de unidades vendidas

    public FuncionarioComissionado(String primeiro_nome, String segundo_nome, double salario, double comissao) {
        super(primeiro_nome, segundo_nome, salario); // chamando o construtor para
                                                     // inicializar as var corretamente

        this.comissao = comissao;
    }

    public double calcularSalario() {
        return getSalario() + (comissao * vendas);
    }

    public void addVendas(int vendas) {
        this.vendas = this.vendas + vendas;
    }

    public void redefinirVendas() {
        vendas = 0;
    }

  

}
