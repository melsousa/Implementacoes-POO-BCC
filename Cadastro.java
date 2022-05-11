public class Cadastro {
    private Product[] produtos = new Product[100];
    private int i = 0;

    public void adicionar(Product p) {
        produtos[i] = p;
        i++;

    }

    public Product[] getProdutos(){
        return produtos;
    }
}
