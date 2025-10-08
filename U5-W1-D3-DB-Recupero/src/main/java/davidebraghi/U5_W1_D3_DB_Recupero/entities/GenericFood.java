package davidebraghi.U5_W1_D3_DB_Recupero.entities;

public abstract class GenericFood {
    private int Calories;
    private double Price;

    public GenericFood(int calories, double price) {
        Calories = calories;
        Price = price;
    }

    public int getCalories() {
        return Calories;
    }

    public void setCalories(int calories) {
        Calories = calories;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }
}