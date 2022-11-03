package sheet.pkg1;
public class person {
     String name;
     float age;
     String address;
     String nation;
    person(){}
    public person(String nme,float a,String na){
        name = nme;
        age = a;
        nation = na;
    }
    public void setName(String nme){
        name = nme;
    }
    public void setAge(int a){
        age = a;
    }
    public void setNation(String na){
        nation = na;
    }
    public void getName(){
        System.out.println("Name is : ");
    }
    public void getAge(){
        System.out.println("Age is : ");
    }
    public void getNation(){
        System.out.println("Nation is : ");
    }
}
