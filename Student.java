public class Student extends Person {
    private final String id;

    public Student(String name, int age, String id) {
        super(name, age);
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", id='" + id + '\'' +
                '}';
    }
}
