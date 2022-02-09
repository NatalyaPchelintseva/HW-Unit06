public class Teacher extends Human {

    private String universityName;
    private String[] coursesList;

    public Teacher(String name, int age, String address, String universityName, String[] coursesList) {
        super(name, age, address);
        this.universityName = universityName;
        this.coursesList = coursesList;
        System.out.println("constructor with parameters in sub class is called for object\t\t\t" + this.hashCode());
    }

    @Override
    public void print() {
        super.print();
        System.out.println("The teacher reads the course(s) ");
        for (String course : coursesList) {
            System.out.println("\t" + course);
        }
    }
}
