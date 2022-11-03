package rev.el.dosoky;
public class salariedEmployee extends employee implements Displayable{
    double salary,bonus,deduction;
    public salariedEmployee(){}
    public salariedEmployee(double salary, double bonus, double deduction) {
        this.salary = salary;
        this.bonus = bonus;
        this.deduction = deduction;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public double getBonus() {
        return bonus;
    }
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    public double getDeduction() {
        return deduction;
    }
    public void setDeduction(double deduction) {
        this.deduction = deduction;
    }
    public salariedEmployee(double salary, double bonus, double deduction, String name, String address, float sns, Gender sex) {
        super(name, address, sns, sex);
        this.salary = salary;
        this.bonus = bonus;
        this.deduction = deduction;
    }
    @Override
    public double earning(){
        return (salary + bonus)-deduction;
    }
    @Override
    public void DisplayAllDetails(){
        System.out.println(super.toString());
        System.out.println(toString());
    }
    @Override
    public void DisplayEarnings(){
        System.out.println("the earning of " +name+" is : " + earning());
    }
    @Override
    public String toString() {
        return "salariedEmployee{" + "\nsalary=" + salary + "\nbonus=" + bonus 
                + "\ndeduction=" + deduction + "}\n}";
    }
}
