
package com.company.constants;

import org.jetbrains.annotations.Nullable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;


/**
 * Created by ee on 21/6/16.
 */

public class PizzaConfigure {




   static List<String> pizzas = new ArrayList<String>();
    Properties prop = new Properties();
  //InputStream inputStream;

public PizzaConfigure() throws IOException {


    FileInputStream fis = null;
        try {

            String propFileName = "/home/ee/mansi/pizzaconfig.properties";

          //  inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);

            fis = new FileInputStream(propFileName);
            prop.load(fis);


        } catch (Exception e) {
            System.out.println("Exception: " + e);
        } finally {

            fis.close();
            //inputStream.close();
        }

    }


    public String getPizzaPrize(String pizzaType )
    {

        return prop.getProperty(pizzaType);
    }


    public  List<String>  getPizzasForCategory(String pizzaCategory){
        String pizzaCategoryList = prop.getProperty(pizzaCategory);
        StringTokenizer pizzaCategoryToken = new StringTokenizer(pizzaCategoryList,":");
        while(pizzaCategoryToken.hasMoreElements())
        {
            pizzas.add(pizzaCategoryToken.nextToken());
        }
        return pizzas ;
    }

}

