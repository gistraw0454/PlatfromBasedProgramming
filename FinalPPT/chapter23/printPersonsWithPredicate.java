@FunctionalInterface
public interface Predicate<T>{
    boolean test(T t);
}

public static void printPersonsWithPredicate(List<Person> roster, Predicate<Person> tester){
    for (Person p : roster){
        if (tester.test(p)){
            p.print.Person();
        }
    }
}

printPersonsWithPredicate(roster, p-> p.getGender() == Person.Sex.MALE && p.getAge()>=18 && p.getAge <=25)