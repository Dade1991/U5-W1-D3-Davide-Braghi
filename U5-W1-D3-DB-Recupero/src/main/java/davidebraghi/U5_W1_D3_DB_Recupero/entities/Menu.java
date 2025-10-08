package davidebraghi.U5_W1_D3_DB_Recupero.entities;

import java.util.List;

public class Menu {
    private List<Pizza> pizzaList;
    private List<Toppings> toppingList;
    private List<Drinks> drinksList;

    public Menu() {
    }

    public Menu(List<Pizza> pizzaList, List<Toppings> toppingList, List<Drinks> drinksList) {
        this.pizzaList = pizzaList;
        this.toppingList = toppingList;
        this.drinksList = drinksList;
    }

    public List<Pizza> getPizzaList() {
        return pizzaList;
    }

    public void setPizzaList(List<Pizza> pizzaList) {
        this.pizzaList = pizzaList;
    }

    public List<Toppings> getToppingList() {
        return toppingList;
    }

    public void setToppingList(List<Toppings> toppingList) {
        this.toppingList = toppingList;
    }

    public List<Drinks> getDrinksList() {
        return drinksList;
    }

    public void setDrinksList(List<Drinks> drinksList) {
        this.drinksList = drinksList;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "pizzaList=" + pizzaList +
                ", toppingList=" + toppingList +
                ", drinksList=" + drinksList +
                '}';
    }
}