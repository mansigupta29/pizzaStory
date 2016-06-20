package com.company.pizza;

import com.company.interfaces.PersonalizePizza;

import java.util.List;

/**
 * Created by ee on 20/6/16.
 */
public class Pizza {

 private PersonalizePizza.PizzaName pizzaName;
    private PersonalizePizza.Crust crust;
    //private PersonalizePizza.Toppings[] toppings;
    List<String> toppings;

    private double crustPrice,toppingPrice=0,basicPizzaPrice,totalPizzaPrice;


    public Pizza(PersonalizePizza.PizzaName pizzaName, List<String> toppings, PersonalizePizza.Crust crust) {
        this.pizzaName = pizzaName;
        this.toppings = toppings;
        this.crust = crust;
    }





    public void createOrder()
    {
        System.out.println("Your order Details are:");
        System.out.print("PizzaName: ");
        System.out.println(pizzaName);
        System.out.print("Toppings: ");
     //   for(PersonalizePizza.Toppings ptoppings: toppings)
       // System.out.print(ptoppings+"\t");
        System.out.println();
        System.out.print("Crust: ");
        System.out.println(crust);
        System.out.print("Total Price to be paid: ");
        System.out.println(calculatePrice());



    }

    private double calculatePrice()
    {

        basicPizzaPrice=pizzaName.value;
        crustPrice= crust.value;
        for(String topping: toppings)
        {
           // toppingPrice=toppingPrice+ptoppings.value;
            toppingPrice = toppingPrice + PersonalizePizza.Toppings.valueOf(topping).value;
        }
        totalPizzaPrice= basicPizzaPrice+crustPrice+toppingPrice;
        return totalPizzaPrice;


    }


}


