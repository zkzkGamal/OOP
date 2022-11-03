/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author zkzk
 */
public class Car {
    private String car;
    private String color;
    private int model;
    private int price;
    public void setName(String c){
        car = c;
    }
    public void setColor(String co){
        color = co;
    }
    public void setModel(int mo){
        model = mo;
    }
    public void setPrice(int pr){
        price = pr;
    }
    public void showCar(){
        System.out.println("the name of car is : " + car);
        System.out.println("the color of car is : " + color);
        System.out.println("the model of car is : " + model);
        System.out.println("the price of car is : " + price);
    }
}
