package ums.oop;
import java.util.Scanner;
public class UMSOOP {
    public static void Start(){
        Scanner in = new Scanner (System.in);
        Student c1 = new Student();
        System.out.print("1-Gpa\n2-Grades\n3-Course\n4-back\nplease, enter here : ");
        int x; x = in.nextInt();
        if(x == 1){
            c1.getGPA();
        }
        else if (x==2){
            System.out.println("Enter the year : ");
            int y = in.nextInt();
            System.out.println("Enter term : ");
            int t = in.nextInt();
            c1.grades(y, t);
        }
        else if(x==3){
            Course cr1 = new Course();
            System.out.print("1-frist year frist term subject\n"
                + "2-frist year sacond term subject\n"
                + "3-sacond year frist term subject\n"
                + "4-sacond year sacond term subject\nplease enter here:");
            int c ;     c = in.nextInt();
            cr1.Display(c);
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
//        char c = 'q';
//        do{
//            char ch,ca='q';
//            System.out.println("------------------------------------------------------------------");
//            System.out.println("hello user --- Welcome --- to your contact ");
//            System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_\nplease enter:- ");
//            System.out.println("c-continue \nq-quit ");
//            System.out.print("Enter here:- ");
//            ch = in.next().charAt(0);
//            switch(ch){
//                case'c':case'C':
//                    Start();
//                    break;
//                case'Q':case'q':
//                    ch = ca;
//                    ca = c;
//                    break;
//                default:
//                    System.out.println("Sorry didn't understand :(");
//            }
//        }while(c !='q'|| c!='Q');
        ASSIm std1 = new ASSIm();
        std1.setID(1);
        System.out.println(std1.getID());
        std1.setName("Zkaria");
        System.out.println(std1.getName()); 
    }
}
