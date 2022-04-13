public class FuncionarioMain {
    public static void main(String[] args) {
        
        FuncionarioComissionado f2 = new FuncionarioComissionado("Marcos", "Almeida", 4.30, 1.00);

        f2.addVendas(4);

        System.out.println("Primeiro Nome " + f2.getPrimeiro_nome());
        System.out.println("Segundo Nome " + f2.getSegundo_nome());
        System.out.println("Salário Mínimo " + f2.getSalario());
        System.out.println("Total do Salário " + f2.calcularSalario());

    }
}
