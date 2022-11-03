//if u make an interface u can't implement from if unless you write all method in the inter face
//you can't make object in main from interface but u can make it in one case if u use as (IFname object = new ClassName) but u cant use any method expet the on in interface
//if u decler a variable u should inizilized it 
package pkgabstract;
public class CD implements retail{
    private String name;
    private float size;
    private float price;
    public CD() {}
    public CD(String name, float size, float price) {
        this.name = name;
        this.size = size;
        this.price = price;
    }
    public void get_name(){
        System.out.println("name : "+ name);
    }
}
