package com.company.interfaces;

/**
 * Created by ee on 20/6/16.
 */
public interface PersonalizePizza {

    public enum PizzaName
    {
        Margharita(200),
        CheeseNTomato(200),
        Farmhouse(200),
        VegSupreme(250),
        MexicanGreenWave(300),
        PeppyPaneer(300);

         public int value;
        PizzaName(int value)
        {
            this.value=value;
        }

    }
    public enum Crust {

        Pan(0),
        Thin(40),
        CheeseBurst(80);

         public int value;

         Crust(int value)
        {
            this.value=value;
        }
    }

    public enum Toppings {
        Tomato(10),
        Jalepino(10),
        Olive(20),
        Paneer(20),
        Capsicum(10),
        Corn(10),
        Cheese(30);
        public int value;

         Toppings(int value)
        {
            this.value=value;
        }
    }

}
