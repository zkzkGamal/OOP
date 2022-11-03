package ums.oop;
public class Subject {
    float math1;
    float Phisics1;
    float intro_com;
    float com_escaes;
    float English1;
//    2nd term
    double math2;
    float Phisics2;
    float English2;
    float Cpp;
    float Web;
//    3th term
    float DS;
    double VP;
    float Elctro;
    float Web2;
    float OOM;
//    4th term
    float OOP;
    float LG;
    double DB;
    float SW;
    float EM;
    public Subject(float math1, float Phisics1, float intro_com, float com_escaes, float English1) {
        this.math1 = math1;
        this.Phisics1 = Phisics1;
        this.intro_com = intro_com;
        this.com_escaes = com_escaes;
        this.English1 = English1;
    }
    public Subject(double math2, float Phisics2, float English2, float Cpp, float Web) {
        this.math2 = math2;
        this.Phisics2 = Phisics2;
        this.English2 = English2;
        this.Cpp = Cpp;
        this.Web = Web;
    }
    public Subject(float DS, double VP, float Elctro, float Web2, float OOM) {
        this.DS = DS;
        this.VP = VP;
        this.Elctro = Elctro;
        this.Web2 = Web2;
        this.OOM = OOM;
    }
    public Subject(float OOP, float LG, double DB, float SW, float EM) {
        this.OOP = OOP;
        this.LG = LG;
        this.DB = DB;
        this.SW = SW;
        this.EM = EM;
    }
}
