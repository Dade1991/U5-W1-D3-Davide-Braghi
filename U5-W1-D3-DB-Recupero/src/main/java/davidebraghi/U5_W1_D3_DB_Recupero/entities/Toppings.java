package davidebraghi.U5_W1_D3_DB_Recupero.entities;

public class Toppings extends GenericFood {
    private String toppingName;

    public Toppings(int calories, double price, String toppingName) {
        super(calories, price);
        this.toppingName = toppingName;
    }

    public String getToppingName() {
        return toppingName;
    }

    public void setToppingName(String toppingName) {
        this.toppingName = toppingName;
    }

    @Override
    public String toString() {
        return "Toppings{" +
                "toppingName='" +
                toppingName +
                ", calories=" +
                getCalories() +
                ", price=" +
                getPrice() +
                '}';
    }
}