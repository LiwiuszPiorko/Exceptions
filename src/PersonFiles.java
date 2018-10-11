import java.util.Scanner;

public class PersonFiles {
    public static void main(String[] args) {
       Scanner person = new Scanner(System.in);
        System.out.println("Podaj imię obywatela: ");
        String firstName = person.nextLine();
        System.out.println("Podaj nazwisko obywatela: ");
        String lastName=person.nextLine();
        System.out.println("Podaj wiek obywatela");
        int age=person.nextInt();
        System.out.println("Podaj pesel obywatela");
        int pesel=person.nextInt();
        Person person1=new Person(firstName,lastName,age,pesel);
        try {
            person1.incorrect(age);
        }catch (IncorrectAgeException e){
            System.err.println("Błąd w rubryce: wiek");
        }
        try {
            person1.incorrectfirstName(firstName);
        }catch (NameUndefinedException e){
            System.err.println("Błąd w rubryce: imię");
        }
        try {
            person1.incorrectlastName(lastName);
        }catch (NameUndefinedException e){
            System.err.println("Błąd w rubryce: nazwisko");
        }
        System.out.println(person1.toString());



    }
}
