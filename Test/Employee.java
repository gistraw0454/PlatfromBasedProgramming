package Test;

public class Employee {
    // static main 메서드
    public static void main(String[] args){
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("RoRO", 40000);
        staff[1] = new Employee(60000);
        staff[2] = new Employee(50000);  // staff[2]도 초기화

        for (var e: staff){
            System.out.println(e);  // toString 호출로 객체 정보 출력
        }
    }

    private String name = "";
    private double salary = 1000;
    private static int nextId = 1;  // nextId는 1부터 시작
    private int id;

    // 생성자
    public Employee(String n, double s){
        name = n;
        salary = s;
        id = nextId;   // ID 할당
        nextId++;      // 다음 ID로 증가
    }

    // 생성자 오버로딩 (이름 없이 생성)
    public Employee(double s){
        this("Employee" + nextId, s);  // 이름을 "Employee" + nextId로 생성
    }

    // Getter 메서드
    public String getName() { return name; }
    public int getId() { return id; }
    public double getSalary() { return salary; }

    // toString 메서드 재정의
    @Override
    public String toString() {
        return "Employee{id=" + id + ", name='" + name + "', salary=" + salary + "}";
    }
}
