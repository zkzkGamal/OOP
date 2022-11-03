package sheet_2;
public class Circle {
    private double radius = (double)1.0;
    private String color = "red";
    public Circle(){}
    public Circle(double radius){
        this.radius = radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public double getRadius(){
        return this.radius;
    }
    public String getArea(){
        double Area = (double) 3.14 * radius * radius;
        return "the radius = "+ radius + " and the Area = " + Area ;
    }   
}
