import java.util.Arrays;

public class EnumMethod{
    public static void main(String[] args){
        Grade[] values = Grade.values();
        System.out.println("values = "+ Arrays.toString(values));
        for (Grade value : values){
            System.out.println(value.name() + value.ordinal());
        }

        String input = "GOLD";
        Grade gold = Grade.valueOf(input);
        System.out.println(gold);
    }    
}

enum Grade{BASIC, GOLD, DIAMOND}
