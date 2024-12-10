// static nested class 쓰는 예시 !!!! *** Builder(static nested class)로 
public class Person{
    private final String firstName;
    private final String lastName;

    private final int age;
    private final String address;
    private final String phoneNumber;


    //생성자
    private Person(Builder builder){
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.address = builder.address;
        this.phoneNumber = builder.phoneNumber;
    } 

    @Override   // println(person) 시 호출되는 부분
    public String toString(){
        return "정보: "+ firstName + " " + lastName + " " + age + " "+ address + " "+ phoneNumber;
    }

    // static nested class ) Person 내부에서만 쓰이는 class라서 nested로 만들었고, 미리 만들어야하므로 외부에서 생성가능하게 static으로 함
    public static class Builder{
        private final String firstName;
        private final String lastName;

        private  int age=0;
        private  String address="";
        private  String phoneNumber="";

        // 생성자
        public Builder(String firstName, String lastName){
            this.firstName = firstName;
            this.lastName = lastName;
        }

        // 선택 매개변수에 대한 메서드들
        public Builder age(int age){
            this.age = age;
            return this;
        }
        public Builder address(String address){
            this.address = address;
            return this;
        }
        public Builder phoneNumber(String phoneNumber){
            this.phoneNumber = phoneNumber;
            return this;
        }

        // Person 객체 만들기
        public Person build(){
            return new Person(this);
        }
    }


    public static void main(String[] args){
        Person person = new Person.Builder("Name","Ld").age(30).address("1234").phoneNumber("12-21-23").build();
        System.out.println(person);
    }

}