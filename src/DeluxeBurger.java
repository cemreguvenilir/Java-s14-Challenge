public class DeluxeBurger extends Hamburger{
    private String drink;
    private String cips;
    public DeluxeBurger() {
        super("Deluxe burger", 19.10, BreadRollType.BURGER);
        super.setMeat("Double");
    }

    @Override
    public void addAddition(String name, double price) {
        System.out.println("Malzeme eklenemez");
    }
}
