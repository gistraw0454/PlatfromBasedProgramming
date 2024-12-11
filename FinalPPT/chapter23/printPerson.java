@FunctionalInterface
interface CheckPerson{
    public abstract boolean test(Person p);
}

public static void printPersons(List<Person> roster, CheckPerson tester){
    for (Person p : roster){
        if (tester.test(p)) p.printPerson();
    }
}


printPersons(roster, (Person p)-> p.getAge() >=18);


printPersons(reoster, (p)-> p.getGender() == Person.Gender.MALE && p.getAge()>=18 && p.getAge()<=25);
