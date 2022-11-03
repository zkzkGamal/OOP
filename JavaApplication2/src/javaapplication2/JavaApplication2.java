package javaapplication2;
import java.util.Scanner;
//there are three class one for car and one for circle and one for employee(over load con)
//there are static class is used for make operation without locat data in memory
public class JavaApplication2 {
    static void carClass(){
        Scanner in = new Scanner (System.in);
        Car car1 = new Car();
        System.out.println("Enrer the car name : ");
        String name = in.nextLine();
        System.out.println("Enrer the color name : ");
        String color = in.nextLine();
        System.out.println("Enrer the car model : ");
        int model = in.nextInt();
        System.out.println("Enrer the car price : ");
        int price = in.nextInt();
        car1.setName(name);
        car1.setColor(color);
        car1.setModel(model);
        car1.setPrice(price);
        car1.showCar();
    }
    public static void main(String[] args) {
        calcStatic.Multibly(10, 9);
    }
}
