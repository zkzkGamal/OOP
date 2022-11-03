package rev.el.dosoky;
public class RevElDosoky {
    public static void main(String[] args) {
        salariedEmployee emp1 = new salariedEmployee(3450, 550, 200, "Ahmed", "2-ddd-aa", 12, Gender.male);
        emp1.DisplayAllDetails();
        emp1.DisplayEarnings();
        Hourly_Employee emp2 = new Hourly_Employee();
        emp2.setHour_rate(10.9d);
        emp2.setNo_of_hour(10);
        emp2.DisplayEarnings();
    }   
}
