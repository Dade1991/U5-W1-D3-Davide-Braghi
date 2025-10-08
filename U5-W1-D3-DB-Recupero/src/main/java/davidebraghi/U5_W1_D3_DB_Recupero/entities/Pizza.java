package davidebraghi.U5_W1_D3_DB_Recupero.entities;

import java.util.List;

public class Pizza extends GenericFood {
    private String pizzaName;
    private List<Toppings> ToppingsList;
    private boolean isXL = false;

    public Pizza(int calories, double price, String pizzaName, List<Toppings> toppingsList, boolean isXL) {
        super(calories, price);
        this.pizzaName = pizzaName;
        ToppingsList = toppingsList;
        this.isXL = isXL;
    }

    public double priceCalculation(List<Toppings> toppingsList, boolean isXL) {
        double totPizzaBasePrice = 4.30;
        if (toppingsList != null) {
            for (int i = 0; i < toppingsList.size(); i++) {
                totPizzaBasePrice += toppingsList.get(i).getPrice();
            }
        }
        if (isXL) {
            return (totPizzaBasePrice += (totPizzaBasePrice * 8) / 100);
        } else {
            return totPizzaBasePrice;
        }
    }

    public int caloriesCalculation(List<Toppings> toppingList, boolean isXL) {
        int totPizzaBaseCalories = 1012;
        if (toppingList != null) {
            for (int i = 0; i < toppingList.size(); i++) {
                totPizzaBaseCalories += toppingList.get(i).getCalories();
            }
        }
        if (isXL) {
            return (totPizzaBaseCalories += (totPizzaBaseCalories * 4) / 100);
        } else {
            return totPizzaBaseCalories;
        }
    }

    public String getPizzaName() {
        return pizzaName;
    }

    public void setPizzaName(String pizzaName) {
        this.pizzaName = pizzaName;
    }

    public List<Toppings> getToppingsList() {
        return ToppingsList;
    }

    public void setToppingsList(List<Toppings> toppingsList) {
        ToppingsList = toppingsList;
    }

    public boolean isXL() {
        return isXL;
    }

    public void setXL(boolean XL) {
        isXL = XL;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "pizzaName='" +
                pizzaName +
                ", ToppingsList=" +
                ToppingsList +
                ", isXL=" +
                isXL +
                ", calories=" +
                getCalories() +
                ", price=" +
                getPrice() +
                '}';
    }
}