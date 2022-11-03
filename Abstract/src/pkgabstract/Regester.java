
package pkgabstract;
enum Gender {male,female};
enum course {DB,OOP,LogicGate};
enum semster {one, two,summer } 

public class Regester {
    String stdName;
    Gender stdgn;
    course crs;
    semster sem;
    public Regester(){
        stdName = "nan";
        stdgn = Gender.male;
        crs = course.OOP;
        sem = semster.two;
    }
}
