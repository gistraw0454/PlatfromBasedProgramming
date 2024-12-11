import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.ArrayList;


interface CheckPerson {
    boolean test(Person p);
}

class CheckPersonEligibleForSelectiveService implements CheckPerson {
    public boolean test(Person p) {
        return (p.getGender() == Person.Gender.MALE) && (p.getAge() >= 18 && p.getAge() <= 25);
    }
}

class Person {
    public enum Gender { MALE, FEMALE }

    private String name;
    private LocalDate birthday;
    private Gender gender;
    private String emailAddress;

    public Person(String name, LocalDate birthday, Gender gender, String emailAddress) {
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.emailAddress = emailAddress;
    }

    public Gender getGender() {return gender;}

    public int getAge() {return Period.between(birthday, LocalDate.now()).getYears();}

    public void printPerson() {System.out.println("Name: " + name + ", Gender: " + gender + ", Age: " + getAge() + ", Email: " + emailAddress);}

    public static void printPersonsOlderThan(List<Person> roster, int age) {
        for (Person p : roster) {
            if (p.getAge() >= age) {
                p.printPerson();
            }
        }
    }

    public static void printPersons(List<Person> roster, CheckPerson tester) {
        for (Person p : roster) {
            if (tester.test(p)) {
                p.printPerson();
            }
        }
    }
}



public class Main {
    public static void main(String[] args) {

        List<Person> roster = new ArrayList<>();    // Person Type List roster 만들기
        roster.add(new Person("John Doe", LocalDate.of(2000, 5, 15), Person.Gender.MALE, "john@example.com"));  // Person 추가하기
        roster.add(new Person("Jane Doe", LocalDate.of(1995, 8, 20), Person.Gender.FEMALE, "jane@example.com"));
        roster.add(new Person("Mike Smith", LocalDate.of(2004, 3, 10), Person.Gender.MALE, "mike@example.com"));

        System.out.println("Persons eligible for selective service:");
        Person.printPersons(roster, new CheckPersonEligibleForSelectiveService());
    }
}