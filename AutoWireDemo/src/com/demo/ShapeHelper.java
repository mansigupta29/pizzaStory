package com.demo;

/**
 * Created by ee on 22/6/16.
 */
public class ShapeHelper {
    private Circle circle;

   public ShapeHelper(Circle circle)
    {
        this.circle=circle;
    }

    /*public void setCircle(Circle circle)
    {
        this.circle = circle;
    }*/

    public void getCircle()
    {
        circle.shapeMethod();
    }
}
