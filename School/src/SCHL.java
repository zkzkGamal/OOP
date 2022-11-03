
import java.util.InputMismatchException;
import java.util.Scanner;
public class SCHL {
static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int q=0;
        do{
            try{
                System.out.println("---------*****----------######---------");
                System.out.println("hello user welcom to our school :) "
                        + "\n\t___---___---___---___\n"
                        + "0-EXit\n1-continue");
                System.out.print("please enter : ");
                int choise = in.nextInt();
                if(choise == 0){
                    break;
                }
                else if(choise == 1){
                    Continueing.continueing();
                }
                else{
                    System.out.println("error, please choose between 0 and 1");
                }
            }catch(InputMismatchException e){
                System.out.println("error input please enter an number :(" );
                break;
            }
        }while(q==0);
    }
    
}
