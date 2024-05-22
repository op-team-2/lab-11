import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("John", 21);
        System.out.println(person);

        Student student = new Student("Alice", 17, "12");
        System.out.println(student);

        Function<Person, String> staticMethodRef = Person::staticMethod;
        System.out.println(staticMethodRef.apply(person));

        Function<Person, String> instanceMethodRef = Person::instanceMethod;
        System.out.println(instanceMethodRef.apply(person));

        BiFunction<String, Integer, Person> constructorRef = Person::new;
        Person newPerson = constructorRef.apply("Emma", 30);
        System.out.println(newPerson);

        Supplier<Person> defaultConstructorRef = () -> new Person("Student", 0);
        Person defaultPerson = defaultConstructorRef.get();
        System.out.println(defaultPerson);
    }
}
