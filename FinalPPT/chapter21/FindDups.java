import java.util.*;
public class FindDup{
    public static void main(String[] args){
        Set<String> s = new HashSet<>();
        for (String a : args){
            if(!s.add(a)){
                System.out.println("중복 검출 : "+ a);
            }
        }
    }
}