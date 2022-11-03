package sheet.pkg1;
public class employee extends person {
    private float salary;
    private int rank;
    private String jop;
    public employee(){}

    public employee(float salary, int rank, String jop) {
        this.salary = salary;
        this.rank = rank;
        this.jop = jop;
    }

    public employee(String nme, float a, String na,float salary, int rank, String jop) {
        super(nme, a, na);
        this.salary = salary;
        this.rank = rank;
        this.jop = jop;
    }
    
    public float getSalary() {
        return salary;
    }
    public void setSalary(float salary) {
        this.salary = salary;
    }
    public int getRank() {
        return rank;
    }
    public void setRank(int rank) {
        this.rank = rank;
    }
    public String getJop() {
        return jop;
    }
    public void setJop(String jop) {
        this.jop = jop;
    }   
}
