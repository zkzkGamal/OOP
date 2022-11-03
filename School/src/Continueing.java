
import java.util.Scanner;
public class Continueing {
    static Scanner in = new Scanner(System.in);
    public static void continueing()  {
        System.out.println("welcome agian user ,please choose one of this\n"
                + "\n1-Student login"
                + "\n2-teacher login"
                + "\n3-Student Registration"
                + "\n4-teacher Registration"
                + "\nplease enter: ");
        int ch = in.nextInt();
        if(ch==1){
            System.out.println("0-0-0-0-0-0-0-0-0-0-0-___________________-0-0-0-0-0-0-0-0-0-0-0-0-0");
            System.out.println("welcome user to our login page for Student :)");
            System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
            Student_log_IN STD = new Student_log_IN();
        }
        else if(ch==2){
            System.out.println("0-0-0-0-0-0-0-0-0-0-0-___________________-0-0-0-0-0-0-0-0-0-0-0-0-0");
            System.out.println("welcome user to our login page for teacher :)");
            System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
            System.out.println("it will come soon please wait for abdo LOL");
        }
        else if(ch==3){
            System.out.println("0-0-0-0-0-0-0-0-0-0-0-___________________-0-0-0-0-0-0-0-0-0-0-0-0-0");
            System.out.println("welcome user to our Registration page for Student :)");
            System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
            Student_Reg std_L = new Student_Reg();
        }
        else if(ch==4){
            System.out.println("0-0-0-0-0-0-0-0-0-0-0-___________________-0-0-0-0-0-0-0-0-0-0-0-0-0");
            System.out.println("welcome user to our Registration page for teacher :)");
            System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
            System.out.println("it will come soon please wait for abdo LOL");
        }
        else{
            System.out.println("invaild input check your choise ");
        }
}
}
