public class HotDrink extends Drink {
    private int temperature;
    

    public HotDrink(String name, double price, double volume, int temperature){
        super(name, price, volume);
        this.temperature = temperature;
    }

    public int getTemperature(){
        return this.temperature;
    }

    public void setTemperature(int temperature){
        this.temperature = temperature;
    }

    @Override
    public void getProduct(String name){
        if (this.getName() == name){
            System.out.printf("name: %s\nprice: %.2f\nvolume: %.2f\ntempeature: %d\n", this.getName(), this.getPrice(), this.getVolume(), this.temperature); 
            System.out.println("---------------------");
        }
    }
}
