public class StringBuilderTest{
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder();
        sb.append("A");
        sb.append("B");
        sb.append("C");
        System.out.println("sb = "+sb);

        sb.insert(3,"Java");
        System.out.println(sb);
        sb.delete(3,7);
        sb.reverse();   // 문자열 뒤집기 !!!!!!
        String str = sb.toString();
        System.out.println(str);
    }
}