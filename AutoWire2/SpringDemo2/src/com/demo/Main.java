package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by ee on 22/6/16.
 */
public class Main {

    public static void main(String[] args)
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        ShapeHelper shapeHelper = (ShapeHelper) context.getBean("ShapeHelper");
        shapeHelper.getShape();
    }

}
