public class LocalClassExample{
    static String regularExpression = "[^0-9]";
    // 메서드
    public static void validatePhoneNumber(String number1, String number2){
        // final local variable
        final int numberLength = 10;

        // local class
        class PhoneNumber{
            String formattedNumber = null;
            PhoneNumber(String number){ // 생성자
                String currentNumber = number.replaceAll(regularExpression,""); // 번호 초기화

                if (currentNumber.length() == numberLength) formattedNumber = currentNumber;    // 번호 길이가 같으면 복사
                else formattedNumber = null;
            }

            public String getNumber(){
                return formattedNumber;
            }
        }

        PhoneNumber myNumber1 = new PhoneNumber(number1);
        PhoneNumber myNumber2 = new PhoneNumber(number2);

        if (myNumber1.getNumber() == null) System.out.println("First number is invalid");
        else System.out.println("First number is " + myNumber1.getNumber());
        
        if (myNumber2.getNumber() == null) System.out.println("Second number is invalid");
        else System.out.println("Second number is " + myNumber2.getNumber());
    }

    public static void main(String[] args){
        validatePhoneNumber("123-123-1233","123-123-1234");
    }
}