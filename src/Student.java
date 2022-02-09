public class Student extends Human {

    private int course;
    private String speciality;

    public Student(String name, int age, String address, int course, String speciality) {
        super(name, age, address);
        this.course = course;
        this.speciality = speciality;
        System.out.println("constructor with parameters in sub class is called for object\t\t\t" + this.hashCode());
    }

    @Override
    public void print() {
        super.print();
        System.out.println("His/here speciality is " + speciality + ".");
    }
}
