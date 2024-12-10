public class EnumGrade{
    public static void main(String[] args){
        int price = 10000;

        DiscountService discountService = new DiscountService();
        int basic = discountService.discount(Grade.BASIC,price);
        System.out.println(basic);
    }    
}

enum Grade{BASIC, GOLD, DIAMOND}

class DiscountService{
    public int discount(Grade grade, int price){
        int discountPercent = 0;

        if (grade == Grade.BASIC) { discountPercent = 10; }
        else if (grade == Grade.GOLD) { discountPercent = 20; }
        else if (grade == Grade.DIAMOND) { discountPercent = 30; }
        else { System.out.println("할인x"); }
        return price*discountPercent/100;
    }
}
