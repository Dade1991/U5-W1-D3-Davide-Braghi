package davidebraghi.U5_W1_D3_DB_Recupero.entities;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class ConfigurationApp {
    @Bean (name="top_tomato")
    public Toppings toppingTomatoBean() {
        return new Toppings (0, 0, "tomato");
    }

    @Bean (name="top_cheese")
    public Toppings toppingCheeseBean(){
        return new Toppings (92, 0.69, "cheese");
    }

    @Bean (name="top_ham")
    public Toppings toppingHamBean(){
        return new Toppings (35, 0.60, "ham");
    }

    @Bean (name="top_onions")
    public Toppings toppingOnionsBean(){
        return new Toppings (22, 0.69, "onions");
    }

    @Bean (name="top_pineapple")
    public Toppings toppingPineappleBean(){
        return new Toppings (24, 0.79, "pineapple");
    }

    @Bean (name="top_salami")
    public Toppings toppingSalamiBean(){
        return new Toppings (86, 0.99, "salami");
    }

    @Bean (name="margherita")
    public Pizza pizzaMargheBean(){
        List<Toppings> toppingsList = new ArrayList<>();
        toppingsList.add(toppingTomatoBean());
        toppingsList.add(toppingCheeseBean());
        return new Pizza(0, 0, "")
    }
}