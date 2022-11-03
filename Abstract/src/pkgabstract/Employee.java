//if you put astract in class you cant use it in main but u can use it in extend class 
//if u use finel in methid u cant make override to it 
//
package pkgabstract;
public class Employee   {
    String name;
    int age;
    String rank;
    float salary;
    String jop;
    public Employee() {}
    public Employee(String name, int age, String rank, float salary, String jop) {
        this.name = name;
        this.age = age;
        this.rank = rank;
        this.salary = salary;
        this.jop = jop;
    }
    public void setSalary(float sal){
        salary = sal;
    }
    public float getSalary(){
        return salary;
    }
    
}
