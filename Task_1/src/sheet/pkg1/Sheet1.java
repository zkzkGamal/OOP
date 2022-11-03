package sheet.pkg1;
import java.util.Scanner;
public class Sheet1 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        student std1 = new student();
        std1.setName("zkzk");
        std1.setAge(19);
        std1.setNation("Egypt");
        std1.setStady_level(4);
        std1.setSpecialization("computer");
        std1.setGPA(3.89);
        std1.displayData();
        student std2 = new student("zkaria", 19, "Cairo",4,"Ai", 3.82);
        System.out.println("____________________________________");
        std2.displayData();
        student std3 = new student("hema", 22, "Cairo",8,"Ai", 3.72);
        System.out.println("____________________________________");
        std3.displayData();
        student std4 = new student("hema", 22, "Cairo",8,"Ai", 3.72);
        System.out.println("____________________________________");
        std4.displayData();
    }
    
}
