import java.util.Scanner;

public class MainProduct {
    public static void main(String[] args) {
        int contador = 0, quantProd, i, resp;
        String name, manufactureDate;
        double price, costumsFee;
        Cadastro v = new Cadastro();

        Scanner s = new Scanner(System.in);

        System.out.println("Quantidades de produtos: ");
        quantProd = s.nextInt();

        for (i = 0; i < quantProd; i++) {
            System.out.println("\nProduct #" + (i + 1) + "data:");
            System.out.print("Common, used or imported (c/u/i)?");
            resp = s.nextInt();

            if (resp == 1) {
                System.out.print("Name: ");
                name = s.next();
                System.out.print("Price: ");
                price = s.nextDouble();
                Product p1 = new Product(name, price);
                v.adicionar(p1);
            } else if (resp == 2) {
                System.out.print("Name: ");
                name = s.next();
                System.out.print("Price: ");
                price = s.nextDouble();
                System.out.print("Date: ");
                manufactureDate = s.next();
                UsedProduct p2 = new UsedProduct(name, price, manufactureDate);
                v.adicionar(p2);
            } else if (resp == 3) {
                System.out.print("Name: ");
                name = s.next();
                System.out.print("Price: ");
                price = s.nextDouble();
                System.out.print("Custom Fee: ");
                costumsFee = s.nextDouble();
                ImportedProduct p3 = new ImportedProduct(name, price, costumsFee);
                v.adicionar(p3);
            }
        }
        System.out.println("\nPRICE TAGS:");
        for (Product el : v.getProdutos()) {
            if (el != null) {
                System.out.println(el.priceTag());
            }
        }

        System.out.println("\n");
    }
}