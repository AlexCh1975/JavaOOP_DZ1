public class Drink extends Product{
    
    private double volume;

    public Drink(String name, double price, double volume){
        super(name, price);
        this.volume = volume;
    }

    public double getVolume(){
        return volume;
    }

    public void setVolume(double volume){
        this.volume = volume;
    }
    
    @Override
    public void getProduct(String name){
        if (this.getName() == name){
            System.out.printf("name: %s\nprice: %.2f\nvolume: %.2f\n", this.getName(), this.getPrice(), this.volume); 
            System.out.println("---------------------");
        }
    }
}
