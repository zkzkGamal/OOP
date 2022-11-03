package rev.el.dosoky;
enum Gender{male,female};
public abstract class employee {
    String name;
    String address;
    float sns;
    Gender sex;
    public employee(){}
    public employee(String name, String address, float sns, Gender sex) {
        this.name = name;
        this.address = address;
        this.sns = sns;
        this.sex = sex;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public float getSns() {
        return sns;
    }
    public void setSns(float sns) {
        this.sns = sns;
    }
    public Gender getSex() {
        return sex;
    }
    public void setSex(Gender sex) {
        this.sex = sex;
    }
    public abstract double earning();

    @Override
    public String toString() {
        return "employee{" + "\nname=" + name + "\naddress=" + address + "\nsns=" + sns
                + "\nsex=" + sex ;
    }
    
}
