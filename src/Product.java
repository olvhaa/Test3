public class Product {
    private String name;
    private double price;
    private String category;
    private int ammount;
    private int VAT;


    public Product(String name, double price, String category, int ammount, int VAT) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.ammount = ammount;
        this.VAT = VAT;

    }

    public double countPriceVAT() {
        double priceVAT = 0;
        priceVAT = this.price * (100 + this.VAT) / 100;
        return priceVAT;
    }

    public double countValueOfAllProduct() {
        double priceOfAllProduct = 0;
        priceOfAllProduct= this.ammount * countPriceVAT();
        return priceOfAllProduct;
    }
    @Override
    public String toString() {
        return "produkt{" +
                "name='" + name + '\'' +
                ", prize=" + price +
                ", category='" + category + '\'' +
                ", ammount=" + ammount +
                ", VAT=" + VAT +
                '}';
    }
}

