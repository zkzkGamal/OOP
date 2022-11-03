/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author zkzk
 */
public class Circle {
    private String color;
    private double radiuc;
    public void setRadiuc(double r){
        radiuc = r;
    }
    public void setColor(String c){
        color = c;
    }
    public void getRadiuc(){
        System.out.println("the radiuc = " + radiuc);
    }
    public void getColor(){
        System.out.println("the color is " + color);
    }
    public void getArea(){
        double ar;
        ar = 3.14 * radiuc * radiuc;
        System.out.println("the are of Circle = " + ar);
    }
    public void getcircumference(){
        double cir;
        cir = 3.14 * radiuc * 2;
        System.out.println("the are of Circle = " + cir);
    }
    public String toString(){
        return "Circle ( color = " + color +" , radiuc =  " + radiuc + " )"; 
    }
}
