public class StringImmutable{
    public static void main(String[] args){
        String str1 = "hello";
        String str2 = str1.concat(" java"); // == new String("hello java")
        System.out.println("str1 = "+str1); // hello    내부 문자열은 불변한다.
        System.out.println("str2 = "+str2); // hello java
    }
}