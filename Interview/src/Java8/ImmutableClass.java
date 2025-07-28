package Java8;
import java.util.Date;


//1. Final Class:
//The class should be declared as final so that it cannot be subclassed.
//
//2. Private Final Fields:
//All fields should be declared as private and final to ensure they are not modified after initialization.
//
//3. No Setter Methods:
//The class should not provide any methods that modify fields or objects referred to by fields.
public final class ImmutableClass  {
    private final String name;
    private final int age;
    private final Date birthDate; // mutable object

    public ImmutableClass (String name, int age, Date birthDate) {
        this.name = name;
        this.age = age;
        // Creating a defensive copy of the mutable Date object
        this.birthDate = new Date(birthDate.getTime());
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Date getBirthDate() {
        // Returning a defensive copy of the mutable Date object
        return new Date(birthDate.getTime());
    }
}