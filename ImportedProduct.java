public class ImportedProduct extends Product {

    private double costumsFree;

    public ImportedProduct(String name, double price, double costumsFree) {
        super(name, price);
        this.costumsFree = costumsFree;
    }

    public double getCostumsFree() {
        return costumsFree;
    }

    public void setCostumsFree(double costumsFree) {
        this.costumsFree = costumsFree;
    }

    public Double totalPrice() {
        return super.getPrice() + getCostumsFree();
    }

    @Override
    public String priceTag() {
        return super.getName() + " $ " + totalPrice() + " (Customs free: $ " + getCostumsFree() + ")";
    }
}