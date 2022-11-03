package pkgabstract;

import java.util.Scanner;
import java.util.InputMismatchException;
public class Abstract {
public static void main(String[] args) {
//        course c1 = course.OOP;
//        course c2 = course.LogicGate;
//        System.out.println(c1.toString());
//        System.out.println(c1.ordinal());
//        System.out.println(c1.equals(c2));
//        System.out.println(c1.compareTo(c2));
    Scanner in = new Scanner(System.in) ;
    int x , y;
        try{
        x = in.nextInt();
        y=in.nextInt();
    }
    catch(Exception e){
        System.out.println("u cant enter string please enter again : ");
        System.out.println("exception typ is : " + e.getMessage());
    }
    
    }
    
}
