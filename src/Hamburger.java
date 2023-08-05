public class Hamburger implements Addable{
    private String name;
    private double price;
    private String meat;
    private BreadRollType breadRollType;
    private Addition addition1;
    private Addition addition2;
    private Addition addition3;
    private Addition addition4;

    public Hamburger(String name, double price, BreadRollType breadRollType) {
        this.name = name;
        this.price = price;
        this.breadRollType = breadRollType;
        this.meat = "Normal";
    }

    public String getName() {
        return name;
    }

    public String getMeat() {
        return meat;
    }

    public double getPrice() {
        return price;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public BreadRollType getBreadRollType() {
        return breadRollType;
    }
    @Override
    public void addAddition(String name, double price) {
        if(addition1 == null){
            this.addition1 = new Addition(name, price);
        } else if (addition2 == null){
            this.addition2 = new Addition(name, price);
        } else if (addition3 == null){
            this.addition3 = new Addition(name, price);
        } else if (addition4 == null){
            this.addition4 = new Addition(name, price);
        } else {
            System.out.println("Burger is full");
        }

    }
    public String itemize(){
        StringBuilder builder = new StringBuilder();
        builder.append("Name: " + name + "\n");
        builder.append("Meat: " + meat + "\n");
        builder.append("BreadRollType: " + breadRollType + "\n");
        if(addition1 != null){
            builder.append("Addition1: " + addition1.getAddition() + "\n");
            price = price + addition1.getAdditionPrice();
        }
        if(addition2 != null){
            builder.append("Addition2: " + addition2.getAddition() + "\n");
            price = price + addition2.getAdditionPrice();
        }
        if(addition3 != null){
            builder.append("Addition3: " + addition3.getAddition() + "\n");
            price = price + addition3.getAdditionPrice();
        }
        if(addition4 != null){
            builder.append("Addition4: " + addition4.getAddition() + "\n");
            price = price + addition4.getAdditionPrice();
        }
        return builder.toString();
    }
    public double itemizeHamburger(){
        String text = itemize();
        System.out.println(text);
        System.out.println("price: " + getPrice());
        System.out.println("----------------------");
        return getPrice();
    }


}
