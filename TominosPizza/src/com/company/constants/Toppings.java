package com.company.constants;

/**
 * Created by ee on 21/6/16.
 */
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
