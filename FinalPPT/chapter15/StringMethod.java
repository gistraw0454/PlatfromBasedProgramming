public class StringMethod{
    public static void main(String[] args){
        String str1 = "Hello, Java!";   // ""으로 문자열 생성
        String str2 = new String("Hello, Java!2");  // 객체 생성
        String str3 = "hello, java!";   // ""으로 문자열 생성

        System.out.println(str1.length());

        System.out.println("비어있는 경우: "+str1.isEmpty());
        System.out.println("비어있거나 공백만 있는 경우: "+str1.isBlank());

        System.out.println("[7]: "+ str1.charAt(7));

        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));

        System.out.println(str1.compareTo(str2));
        System.out.println(str1.compareToIgnoreCase(str2));

        System.out.println(str1.startsWith("hello"));
        System.out.println(str1.endsWith("Java!"));
        System.out.println(str1.contains("Java"));
        System.out.println(str1.indexOf("Java"));   //lastIndexOf 이런것도있음(마지막으로 나오는 java의 인덱스)

        String str = "Hello, Java! Welcome to Java";
        System.out.println("인덱스 7부터의 부분 문자열: " + str.substring(7));  // Java! Welcome to Java
        // (7, 12) 하면 ? Java! 
        System.out.println("문자열 결합: " + str.concat("!!!"));    // 연결
        System.out.println("'Java'를 'World'로 대체: " + str.replace("Java", "World"));
        System.out.println("첫 번째 'Java'를 'World'으로 대체: " + str.replaceFirst("Java", "World"));
        System.out.println("소문자로 변환: " + str.toLowerCase());    // 대문자 변환
        System.out.println("대문자로 변환: " + str.toUpperCase());    // 소문자 변환
        System.out.println("공백 제거(trim): '" + str.trim() + "'");  // 공백 제거
        System.out.println("공백 제거(strip): '" + str.strip() + "'");    // 공백 제거
        System.out.println("앞 공백 제거(strip): '" + str.stripLeading() + "'");
        System.out.println("뒤 공백 제거(strip): '" + str.stripTrailing() + "'");
    
        String str4 = "Apple,Banana,Orange";
        // split()
        String[] splitStr= str4.split(",");
        for (String s : splitStr) {
        System.out.println(s);
        }
        // join()
        String joinedStr= String.join("-", "A", "B", "C");
        System.out.println("연결된 문자열: " + joinedStr);
        // 문자열 배열 연결
        String result = String.join("-", splitStr);
        System.out.println("result = " + result);

        Object obj = new Object();

        // 다음과 같이 간단히 변환할 수 있음 (문자 + x -> 문자x)
        String numString2 = "" + num; System.out.println("빈문자열 + num:" + numString2);
        
        char[] strCharArray = str.toCharArray();
        System.out.println("문자열을 문자 배열로 변환: " + strCharArray);
        for (char c : strCharArray) {
        System.out.print(c);
        }

        System.out.printf("숫자: %.2f\n", 10.1234);
        String format2 = String.format("숫자: %.2f", 10.1234);
        System.out.println(format2);
    }
}