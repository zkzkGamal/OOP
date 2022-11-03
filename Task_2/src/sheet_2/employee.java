package sheet_2;
public class employee extends Person {
    private double hourRate;
    private double workingHour;
    private double salary;
    public employee(){}
    public employee(int Id , String name) {
        super(name, Id);
    }
    @Override
    public String toString(){
        int ID = getId();      String name = getName();
        salary = (double)(workingHour*hourRate*25);
        return "Employee[" + " ID= "+ID + " , name = "+name
               +" , hourRate = "+hourRate + " , workingHour = "+workingHour
                +" , salary = " + salary;
    }
    public void setHourRate(double hourRate) {
        this.hourRate = hourRate;
    }
    public void setWorkingHour(double workingHour) {
        this.workingHour = workingHour;
    }
}
