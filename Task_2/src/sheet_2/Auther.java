package sheet_2;
public class Auther {
    private String name;
    private String email;
    private char gender;
    public Auther(){}
    public Auther(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    public void setEmail(String em){
        this.email = em;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public char getGender() {
        return gender;
    }   
    @Override
    public String toString() {
        return "Auther{" + "name=" + name + ", email=" + email + ", gender=" + gender + '}';
    }
}
