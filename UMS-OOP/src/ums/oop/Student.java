package ums.oop;

import java.util.Scanner;

public class Student extends person{
    Scanner in = new Scanner (System.in);
    int ID;
    private float GPA;
    public Student(){}
    public Student(int ID, String name, int age, String email, String phone_num) {
        super(name, age, email, phone_num);
        this.ID = ID;
    }
    public void grades(int x,int y){
        if(x==1&&y==1){
            System.out.println("math1 : A");
            System.out.println("Phisics1 : A");
            System.out.println("intro_com: A");
            System.out.println("com_escaes : A");
            System.out.println("English1 : A");
            getGPA();
        }
        else if(x==1&&y==2){
            System.out.println("math2 : A");
            System.out.println("Phisics2 :B+");
            System.out.println("English2 : A");
            System.out.println("Cpp : A");
            System.out.println("Web :A");
            getGPA();
        }
        else if(x==2&&y==1){
            System.out.println("DS : A");
            System.out.println("VP : A");
            System.out.println("Elctro : A");
            System.out.println("Web2 : A");
            System.out.println("OOM : A");
            System.out.print("and ur GPA : ");
            getGPA();
        }
        else if(x==2&&y==2){
            System.out.println("coming soon");
        }
        else{
            System.out.println("Error can't find :(");
        }
        
    }
    public void getGPA(){
            GPA = (float) 3.87;
            System.out.println("Your GPA : " + GPA);
        }
}
