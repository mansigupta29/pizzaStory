package com.company;

import com.company.interfaces.PersonalizePizza;
import com.company.pizza.Pizza;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> toppings = new ArrayList<String>();
        toppings.add("Olive");
        toppings.add("Corn");
        Pizza pizza = new Pizza(PersonalizePizza.PizzaName.MexicanGreenWave, toppings,PersonalizePizza.Crust.CheeseBurst);
        pizza.createOrder();


     /*   PersonalizePizza.Toppings t = PersonalizePizza.Toppings.valueOf("TOMATO");

        System.out.println(t);*/

    }
}
