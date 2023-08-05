public class HealthyBurger extends Hamburger{
    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String name, double price, BreadRollType breadRollType) {
        super(name, price, breadRollType);
        setMeat("Tofu");
    }
    public void addHealthyAddition1(String name, double price){
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }
    public void addHealthyAddition2(String name, double price){
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    @Override
    public double itemizeHamburger() {
        String explanation = super.itemize();
        System.out.println(explanation);
        StringBuilder builder = new StringBuilder();
        if(healthyExtra1Name != null){
            builder.append("healthyExtra1: " + healthyExtra1Name + "\n");
        }
        if(healthyExtra2Name != null){
            builder.append("healthyExtra2: " + healthyExtra2Name + "\n");
        }
        double healthyPrice = getPrice() + healthyExtra1Price + healthyExtra2Price;
        builder.append("total price: " + healthyPrice);
        System.out.println(builder.toString());
        return healthyPrice;

    }
}
