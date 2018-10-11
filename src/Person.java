import java.util.Objects;

public class Person {
    String firstName;
    String lastName;
    int age;
    int pesel;

    public Person(String firstName, String lastName, int age, int pesel) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.pesel = pesel;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPesel() {
        return pesel;
    }

    public void setPesel(int pesel) {
        this.pesel = pesel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                pesel == person.pesel &&
                Objects.equals(firstName, person.firstName) &&
                Objects.equals(lastName, person.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age, pesel);
    }

    @Override
    public String toString() {
        return "" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", pesel=" + pesel +
                "";
    }

    public int incorrect(int age)throws IncorrectAgeException {
        if (age < 1)
            throw new IncorrectAgeException();
        else
            return age;
    }

    public String incorrectfirstName(String firstName)throws NameUndefinedException {
        int długość = firstName.length();
        if (firstName == null || długość < 2)
            throw new NameUndefinedException();
        else
            return firstName;

    }
    public String incorrectlastName(String lastName)throws NameUndefinedException{
        int długość2 = lastName.length();
        if (lastName == null || długość2 < 2)
            throw new NameUndefinedException();
        else
            return lastName;
    }
}
