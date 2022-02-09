public class Human {
    protected String name;
    protected int age;
    protected String address;

    public Human() {
        this("no name", 0, "no address");
        System.out.println("constructor without parameters in base class is called for object\t\t" + this.hashCode());
    }

    public Human(java.lang.String name, int age, java.lang.String address) {
        this.name = name;
        this.age = age;
        this.address = address;
        System.out.println("constructor with parameters in base class is called for object\t\t\t" + this.hashCode());
    }

    public void print() {
        System.out.println(name + " lives in/at " + address + ".");
    }
}
