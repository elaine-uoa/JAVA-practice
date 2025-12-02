public class Flower {
    private String name;
    private int petals;
    private float price;

    public Flower(String name, int petals, float price) {
        this.name = name;
        this.petals = petals;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int getPetals() {
        return petals;
    }
}
