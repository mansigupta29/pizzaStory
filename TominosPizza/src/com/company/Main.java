package com.company;

import com.company.constants.Crust;
import com.company.pizza.Pizza;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        List<String> toppings = new ArrayList<String>();
        toppings.add("Olive");
        toppings.add("Corn");
        Pizza pizza = new Pizza("exoticVegPizzas","MexicanGreenWave", toppings, Crust.CheeseBurst);
        String order = pizza.createOrder();

        System.out.println(order);

    }
}
