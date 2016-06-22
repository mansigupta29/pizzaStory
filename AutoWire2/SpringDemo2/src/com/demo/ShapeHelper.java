package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * Created by ee on 22/6/16.
 */
public class ShapeHelper {

/*@Autowired
        @Qualifier("circle")*/
    Shape shape;

/*    public ShapeHelper(Shape shape)
    {
        this.shape=shape;
    }*/

    public void setShape(Shape shape)
    {
        this.shape = shape;
    }

    public void getShape()
    {
        shape.shapeMethod();
    }
}
