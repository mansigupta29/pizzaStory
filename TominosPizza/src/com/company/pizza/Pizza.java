package com.company.pizza;

import com.company.constants.Crust;
//import com.company.constants.PizzaType;
import com.company.constants.PizzaConfigure;
import com.company.constants.Toppings;
//import com.company.constants.PizzaConfigure;


import java.io.IOException;
import java.util.*;

/**
 * Created by ee on 20/6/16.
 */
public class Pizza {



    private String pizzaName,pizzaCategory;
    private Crust crust;
    private List<String> toppings;


    private double crustPrice, toppingPrice=0, basicPizzaPrice, totalPizzaPrice;


    public Pizza(String pizzaCategory,String pizzaName, List<String> toppings, Crust crust) {
        this.pizzaName = pizzaName;
        this.toppings = toppings;
        this.crust = crust;
        this.pizzaCategory= pizzaCategory;
    }





   public String createOrder() throws IOException {

        return "Your order withe Pizza: "+pizzaName+" and total price to be paid: "+calculatePrice();

    }

    private double calculatePrice() throws IOException {
        PizzaConfigure pizzaConfigure = new PizzaConfigure();


        List<String> pizzas = new ArrayList<>();
        pizzas=pizzaConfigure.getPizzasForCategory(pizzaCategory);

        if(pizzas.contains(pizzaName) && pizzaCategory.equalsIgnoreCase("simplevegpizzas"))
        {

            basicPizzaPrice= Double.parseDouble(pizzaConfigure.getPizzaPrize("simpleVegPrize"));
        }
        if(pizzas.contains(pizzaName) && pizzaCategory.equalsIgnoreCase("exoticvegpizzas"))
        {
            basicPizzaPrice= Double.parseDouble(pizzaConfigure.getPizzaPrize("exoticVegPrize"));
        }
        if(pizzas.contains(pizzaName) && pizzaCategory.equalsIgnoreCase("classicvegpizzas"))
        {
            basicPizzaPrice= Double.parseDouble(pizzaConfigure.getPizzaPrize("classicVegPrize"));
        }



        crustPrice= crust.value;
        for(String topping: toppings)
        {
            toppingPrice = toppingPrice + Toppings.valueOf(topping).value;
        }
        totalPizzaPrice= basicPizzaPrice+crustPrice+toppingPrice;
        System.out.print(totalPizzaPrice);
        return totalPizzaPrice;


    }


}


