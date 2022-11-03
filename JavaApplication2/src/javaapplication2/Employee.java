package javaapplication2;
public class Employee {
    private int empID;
    private String Name;
    private String Depart;
    private double Salary;
    private double Bonus;
    private boolean Resident;
    
    public Employee(){
        empID = 1;
        Name = "zkaria";
        Depart = "Copmuter";
        Salary = 4200;
        Bonus = 300;
        Resident = true;
    }
    public Employee(int ID , String na){
        empID = ID;
        Name = na;
        Depart = "Copmuter";
        Salary = 4500;
        Bonus = 500;
        Resident = true;
    }
    public Employee(int ID , String na,boolean Re){
//        empID = ID;
//        Name = na;
        this (ID,na);
        Resident = Re;
        Depart = "Engneer";
        Salary = 4000;
        Bonus = 200;
    }
    public Employee(int ID , String na,boolean Re , String De,double sa,double bo){
        this (ID,na,Re);
        Depart = De;
        Salary = sa;
        Bonus = bo;
    }
    public void print_data(){
        System.out.println("ID: "+ empID 
                +"\nName: "+ Name
                +"\nDepart: "+ Depart 
                + "\nSalary: "+ Salary +"$"
                +"\nBouns: "+ Bonus + "$"
                +"\nResident: "+ Resident);
    }
    
}
