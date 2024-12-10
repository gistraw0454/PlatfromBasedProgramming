class OuterClass{
    private String name;

    static class StaticNestedClass{
        int id = 0;
        static int COUNT = 5;
    }

    public String toString(){
        String msg = "Instance" + name;
        return msg;
    }

    StaticNestedClass snc = new StaticNestedClass();

    public static void main(String[] args){
        StaticNestedClass s = new StaticNestedClass();  // static nested class는 컴파일시 바로 만들어지므로, 바로 객체 생성 가능
        System.out.println(s.COUNT);
    }

    public int getCount(){
        StaticNestedClass s = new StaticNestedClass();
        return s.COUNT;
    }
}