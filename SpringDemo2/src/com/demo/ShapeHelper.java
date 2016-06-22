package com.demo;

/**
 * Created by ee on 22/6/16.
 */
public class ShapeHelper {

    Shape shape;

    public ShapeHelper(Shape shape)
    {
        this.shape=shape;
    }

    public void getShape()
    {
        shape.shapeMethod();
    }
}
