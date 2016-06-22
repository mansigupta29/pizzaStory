package com.company.constants;

/**
 * Created by ee on 21/6/16.
 */
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
