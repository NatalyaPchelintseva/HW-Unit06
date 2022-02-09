public class App {
    public static void main(String[] args) {
        Human h = new Human();
        h.print();
        Student s1 = new Student("Ivan", 18, "Kaluga", 1, "it");
        s1.print();
        Teacher t1 = new Teacher("III", 30, "Kaluga", "BU", new String[]{"111", "222"});
        t1.print();
        Human s2 = new Student("Petr", 20, "Moscow", 1, "it");
        s2.print();
        Human t2 = new Teacher("SSS", 35, "Moscow", "MGU", new String[]{"333"});
        t2.print();

        System.out.println("Is teacher a human? " + (t2 instanceof Teacher));
        System.out.println("Is teacher a student? " + (t2 instanceof Student));
    }
}
