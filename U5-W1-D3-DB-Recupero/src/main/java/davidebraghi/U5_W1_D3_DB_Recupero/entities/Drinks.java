package davidebraghi.U5_W1_D3_DB_Recupero.entities;

public class Drinks extends GenericFood {
    private String drinkName;

    public Drinks(int calories, double price, String drinkName) {
        super(calories, price);
        this.drinkName = drinkName;
    }

    public String getDrinkName() {
        return drinkName;
    }

    public void setDrinkName(String drinkName) {
        this.drinkName = drinkName;
    }

    @Override
    public String toString() {
        return "Drinks{" +
                "drinkName='" +
                drinkName +
                ", calories=" +
                getCalories() +
                ", price=" +
                getPrice() +
                '}';
    }
}