
import java.sql.*;
import java.util.Scanner;

public class Student_log_IN extends Connect{
    Scanner in = new Scanner(System.in);
    public Student_log_IN(){
        data_Checker();
    }
    private void data_Checker(){
        try{
            System.out.print("enter user name : ");
            String x = in.nextLine();
            System.out.print("enter password : ");
            String y = in.nextLine();
            this.rs = this.st.executeQuery("select * from SCHOOL.STUDENT_ACC where STD_EMAIL = '" + x +"' and PASS = '" + y + "'");
            if(this.rs.next()){
                System.out.println("welcome " + rs.getString("log"));
            }else{
                System.out.println("check ur pass");
            }
        }catch(SQLException e){
            System.out.println("error lol :(");
            e.printStackTrace();
        }
    }
}
