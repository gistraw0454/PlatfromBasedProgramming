List<Person> rosterAsList = Arrays.asList(new Person("Lee"), new Person("Park"),new Person("Kin"));

// Comparator 구현으로 비교(sort) 기준 정할 수 있음
class PersonNameComparator implements Comparator<Person>{
    public int compare(Person a, Person b){
        return a.getName().compareTo(b.getName());
    }
}

rosterAsList.sort(new PersonNameComparator());

// anoymous class
rosterAsList.sort( new Comparator<Person>() {
    public int compare(Person a, Person b) {
        return a.getName().compareTo(b.getName());
    }
} );

//lambda
rosterAsList.sort((a,b)-> a.getName().compareTo(b.getName()));

//method reference compareByname 구현해야함
rosterAsList.sort( Person::compareByName );