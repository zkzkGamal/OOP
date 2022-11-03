package ums.oop;
enum fYfT{math1, Phisics1,intro_com,com_escaes,English1}
enum fYsT{math2,Phisics2,English2,Cpp,Web}
enum sYfT{DS,VP,Elctro,Web2,OOM}
enum sYsT{OOP,LG,DB,SW,EM}
public class Course  {
    public void getF_y_F_t_Subject(){
        fYfT x;
        System.out.println(fYfT.English1+" "+fYfT.Phisics1+" "
                +fYfT.com_escaes+" "+fYfT.intro_com+" "+fYfT.math1);
    }
    public void getF_y_S_t_Subject(){
        System.out.println( fYsT.Cpp+" "+fYsT.English2 +" "
                +fYsT.Phisics2 +" "+fYsT.Web +" "+fYsT.math2);
    }
    public void getS_y_F_t_Subject(){
        System.out.println(sYfT.DS+" "+sYfT.Elctro+" "
                +sYfT.OOM+" "+sYfT.VP+" "+sYfT.Web2);
    }
    public void getS_y_S_t_Subject(){
        System.out.println(sYsT.DB+" "+sYsT.EM+" "
        +sYsT.LG+" "+sYsT.OOP+" "+sYsT.SW);
    }
    public void Display(int c){
        if(c==1){
            getF_y_F_t_Subject();
        }
        else if(c==2){
            getF_y_S_t_Subject();
        }
        else if(c==3){
            getS_y_F_t_Subject();
        }
        else if(c==4){
            getS_y_S_t_Subject();
        }
        else {
            System.out.println("Error we can't find :(");
        }
    }
}
