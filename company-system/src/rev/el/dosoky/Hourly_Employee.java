package rev.el.dosoky;
public class Hourly_Employee extends employee implements Displayable{
    private int no_of_hour;
    private double hour_rate;

    public int getNo_of_hour() {
        return no_of_hour;
    }

    public void setNo_of_hour(int no_of_hour) {
        this.no_of_hour = no_of_hour;
    }

    public double getHour_rate() {
        return hour_rate;
    }

    public void setHour_rate(double hour_rate) {
        this.hour_rate = hour_rate;
    }
    
    @Override 
    public double earning(){
        return no_of_hour * hour_rate;
    }
    @Override 
    public void DisplayAllDetails(){
        System.out.println(super.toString());
        System.out.println(toString());
    }
    public void DisplayEarnings(){
        System.out.println("and earning : "+earning());
    }

    @Override
    public String toString() {
        return "Hourly_Employee{" + "no_of_hour=" + no_of_hour + ", hour_rate=" + hour_rate + '}';
    }
    
}
