package sheet_2;
public class Triangle {
    private double side1;
    private double side2;
    private double side3;
    public Triangle(){}
    public Triangle(double s1,double s2,double s3){
        this.side1=s1;
        this.side2=s2;
        this.side3=s3;
    }
    public double getSide1() {
        return side1;
    }
    public double getSide2() {
        return side2;
    }
    public double getSide3() {
        return side3;
    }    
    public void getArea(){
        double high=(double)Math.sqrt(Math.pow(side3, 2)-Math.pow(side1, 2));
        double area = (double) side3 * 0.5 * high ;
        System.out.println("Area = "+ area);
    }
    public void getPerimeter(){
        double peri = side1+side2+side3;
        System.out.println("Perimeter = "+ peri);
    }
}
