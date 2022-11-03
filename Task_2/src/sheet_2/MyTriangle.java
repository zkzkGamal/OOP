package sheet_2;
public class MyTriangle {
    private double x1;
    private double x2;
    private double x3;
    private double y1;
    private double y2;
    private double y3;
    public MyTriangle() {}
    public MyTriangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        this.x1 = x1;       this.y1 = y1;
        this.x2 = x2;       this.y2 = y2;
        this.x3 = x3;       this.y3 = y3;
    }
    private double getV1(){
        double a = (double)Math.pow((x2-x1),2);
        double b = (double)Math.pow((y2-y1),2);
        double v1 = (double) Math.sqrt((a-b));      return v1;    
    }
    private double getV2(){
        double a = (double)Math.pow((x3-x1),2);
        double b = (double)Math.pow((y3-y1),2);
        double v2 = (double) Math.sqrt((a-b));      return v2;
    }
    private double getV3(){
        double a = (double)Math.pow((x3-x2),2);
        double b = (double)Math.pow((y3-y2),2);
        double v3 = (double) Math.sqrt((a-b));      return v3;
    }
    public void getPerimeter(){
        double v1 = getV1();    double v2 = getV2();    double v3 = getV3();
        double Perimeter =  (double)(v1 + v2 +v3);
        System.out.println("perimeter = "+Perimeter);
    }
    public void getType(){
        double v1 = getV1();    double v2 = getV2();    double v3 = getV3();
        if(v1==v2&&v1==v3){System.out.println("equilateral");}
        else if(v1==v2||v1==v3){System.out.println("isosceles");}
        else{System.out.println("scalene");}
    }
    @Override
    public String toString(){
        return "MyTringle[v1=("+x1+','+y1+"),v2=("+x2+','
                +y2+")v3=("+x3+','+y3+")]";
    }
}
