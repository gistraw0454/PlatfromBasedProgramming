// refactoring 최종 !!

public class EnumRef4{
    public static void main(String[] args){
        int price = 10000;
        Grade[] grades = Grade.values;
        for (Grade grade : grades){
            print(grade, price);
        }
    }

    public static void print(Grade grade, int price){
        System.out.println(grade.name()+" : "+grade.discount(price));
    } 
}

enum Grade{
    BASIC(10), BRONZE(15), GOLD(20), DIAMOND(30);
    private final int discountPercent;
    Grade(int discountPercent){
        this.discountPercent = discountPercent;
    }

    public int getDiscountPercent(){
        return discountPercent;
    }

    public int discount(int price){
        return price*discountPercent/100;
    }
}