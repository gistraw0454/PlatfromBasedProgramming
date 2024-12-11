interface MyFactory {
    String create(String message);
}

public class LocalVariableCapture {
    public static void main(String[] args) {
        String greeting = "Hello"; // 로컬 변수
        MyFactory myFactory = (message) -> {    //myFactory에 람다 표현식 구현 저장
            return greeting + ": " + message;
        };

        // 람다를 사용하여 결과 출력
        System.out.println(myFactory.create("Java Lambda"));
    }
}
