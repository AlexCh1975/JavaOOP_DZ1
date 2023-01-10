public class Product{
    private String name;
    private double price;

    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return this.name;
    }

    public double getPrice(){
        return this.price;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public void getProduct(String name){
        if (this.name == name){
            System.out.printf("name: %s\nprice: %.2f\n", this.name, this.price);
            System.out.println("---------------------");
        }
    }
}