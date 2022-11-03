

import java.sql.*;
import java.util.Scanner;

public class Student_Reg extends Connect {
    Scanner in = new Scanner(System.in);
    public Student_Reg(){
         DATA_IN();
    }
    private  void DATA_IN(){
         try{
            System.out.print("enter student id : ");
            String STD_ID = in.nextLine();
            System.out.print("enter Student F-name : ");
            String STD_Fname = in.nextLine();
            System.out.print("enter Student L-name : ");
            String STD_Lname = in.nextLine();
            System.out.print("enter Student Phone : ");
            String STD_Phone = in.nextLine();
            System.out.print("enter Student Email : ");
            String STD_Email = in.nextLine();
            System.out.print("Enter Student Gender : ");
            String STD_Gndr = in.nextLine();
            System.out.print("Enter Student Age : ");
            String STD_Age = in.nextLine();
            System.out.print("Enter Student Year_ID : ");
            String STD_yearID = in.nextLine();
            
             System.out.println("----------------------------------------------------------------");
             
             System.out.print("enter student Email-account : ");
             String STD_EM_ACC = in.nextLine();
             System.out.println("enter Student password : ");
            String STD_Pass = in.nextLine();
            System.out.println("confirm your password : ");
            String STD_CPass = in.nextLine();
            System.out.println("enter Student log_ID");
             String STD_LOG_ID = in.nextLine();
             System.out.println("enter Student log");
             String STD_LOG = in.nextLine();
             
             
            if(Confirm_pass(STD_Pass, STD_CPass) == true){
                
                String Query = "insert into SCHOOL.STUDENT   values('" 
                       + STD_ID + "','" + STD_Fname +"','"+ STD_Lname
                       +"','"+ STD_Phone +"','"+ STD_Email +"','"+ STD_Gndr +"','"
                       + STD_Age +"','"+STD_yearID+"')";
               rs= st.executeQuery(Query);
               
               
               String Query1 = "insert into SCHOOL.STUDENT_ACC values('" + STD_EM_ACC + "','" + STD_Pass +"','"+ STD_LOG_ID
                                +"','"+ STD_LOG+"')"; 
                rs= st.executeQuery(Query1);
                
                
                System.out.println("your data is saved");
            }else{
                System.out.println("Check your password please :(");
            }
        }catch(SQLException e){
            System.out.println("error of connection check ur SQL Exception");
            e.printStackTrace();
        }
    }
    private boolean Confirm_pass(String x,String y){
        if(x.equals(y)){
            return true;
        }
        else{
            return false;
        }
    }
}
