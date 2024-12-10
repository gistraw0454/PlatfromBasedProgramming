class OuterClass{
    class InnerClass{   // OuterClass가 생겨야 객체 생성 가능
        int inner= 2;
        // static int count = 0; 불가능 !   // 컴파일시 바로 만들기는 어려움.. -> 내부 static 변수 만들기 금지 !
    }

    public String toString(){   // 기본 객체 메서드  
        class LocalClass{   // local inner class <- 한번쓰고 버림
            int local = 0;
            final static int COUNT = 0;
        }
    }

    InnerClass ic = new InnerClass();   // Outerclass 객체가 생성되고나면 Innerclass 생성가능

    public static void main(String[] args){
        //InnerClass i = oc.new InnerClass(); // outerclass가 생성되어야지 inner클래스만 생성가능하다.
        OuterClass oc = new OuterClass();
        InnerClass i = oc.new InnerClass(); // oc.new InnerClass()로 내부 객체 생성
        System.out.println(i.inner);
    }

    public int getHash(){
        // LocalClass lc = new LocalClass();    // 한번쓰고 버린놈을 외부에서 호출할 수 없다.
        return (new InnerClass()).hashCode();  // 이제는 사용가능하다..
    }
}