

public class FuncionarioMain {
    public static void main(String[] args) {
        FuncionarioComissionado f2 = new FuncionarioComissionado("85f2", "Almeida", 4, 6.25);
        FuncionarioAssalariado f1 = new FuncionarioAssalariado("87r43", "Mariana", 303.00);
        FuncionarioHora f3 = new FuncionarioHora("85f2", "Almeida", 303.00, 5, 37.87);
        
        System.out.println(f2.toString());
        System.out.println(f1.toString());
        System.out.println(f3.toString());

    }
}
