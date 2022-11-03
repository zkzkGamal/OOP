package sheet_2;
public class Person {
    private String name;
    private int Id;
    public Person(){}
    public Person(String name,int Id){
        this.name = name;
        this.Id = Id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setId(int Id) {
        this.Id = Id;
    }
    public String getName() {
        return name;
    }
    public int getId() {
        return Id;
    }   
    @Override
    public String toString() {
        return "Person{" + "Id=" + Id + ", name=" + name + '}';
    }  
}
