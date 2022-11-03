package sheet_2;
public class Student extends Person {
    private float GPA;
    public Student(){}
    public Student(int Id, String name, float GPA) {
        super(name, Id);
        this.GPA = GPA;
    }
    @Override
    public String toString() {
        String name = getName();    int ID = getId();
        return "Student{" +"ID = " +ID +", name = "+name+ ", GPA=" + GPA + '}';
    }
    
}
