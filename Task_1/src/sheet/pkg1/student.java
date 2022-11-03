package sheet.pkg1;
public class student extends person{
    private String specialization;
    private int stady_level;
    private double GPA;
    private static int count;
    public student(){count ++;}
    public student(String nme,float ag,String na,int stady_level,String sp,double gpa){
        super(nme,ag,na);
        GPA = gpa;
        specialization = sp;
        this.stady_level = stady_level;
        count ++;
    }
    public int getCount() {
        return count;
    }
    public void setGPA(double gpa){
        GPA = gpa;
    }
    public void setSpecialization(String sp){
        specialization = sp;
    }

    public void setStady_level(int stady_level) {
        this.stady_level = stady_level;
    }
    public void getGPA(){
        System.out.println("GPa is : " + GPA);
    }
    public void getSpecialization(){
        System.out.println("Specialization is : " + specialization);
    }

    public int getStady_level() {
        return stady_level;
    }
    public void displayData(){
        System.out.println(count+"- name is : " + name);
        System.out.println("his age is : " + age);
        System.out.println("his nationality is : " + nation);
        System.out.println("his stady level is : " + stady_level);
        System.out.println("his Specialization is : " + specialization);
        System.out.println("his GPa is : " + GPA);
    }
}
