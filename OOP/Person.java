/* class OOP2 {
    public static void main(String[] args) {
        OOP object = new OOP();
        System.out.println(object.x);
    }
} */

public class Person {
    /* private String name; */  //Private so won't work

    public String name;

    public String getName() {
        return name;
    }
    public void setName(String newName) {
        this.name = newName;
    }
}