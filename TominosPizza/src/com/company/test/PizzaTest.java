package com.company.test;

import static org.junit.Assert.*;

import com.company.constants.Crust;
import org.junit.Test;
import com.company.pizza.Pizza;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ee on 21/6/16.
 */
public class PizzaTest {

    @Test
    public void testCreateOrder() throws Exception {
        List<String> toppings = new ArrayList<String>();
        toppings.add("Olive");
        toppings.add("Corn");

        Pizza pizza = new Pizza("exoticVegPizzas","MexicanGreenWave", toppings, Crust.CheeseBurst);



        assertEquals("Your order withe Pizza: MexicanGreenWave and total price to be paid: 410.0",pizza.createOrder());


    }
}