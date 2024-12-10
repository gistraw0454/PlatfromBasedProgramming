// 이걸보자. Inner Class and Nested Static class

public class OuterClass{
    String outerField = "Outer field";  // non-static field
    static String staticOuterField = "Static outer field";


    // non-static inner class 는 외부 요소에 접근 가능하다. (OuterClass가 만들어져야 InnerClass가 만들어질 수 있으니까 공유가 가능한거임)
    class InnerClass{
            void accessMembers(){
                System.out.println(outerField);
                System.out.println(staticOuterField);
            }
    }

    static class StaticNestedClass{
        void accessMembers(OuterClass outer){
            // System.out.println(outerField); // non-static field에 접근할 수 없다. (static class가 먼저 만들어지니까.)
            System.out.println(outer.outerField);   
            System.out.println(staticOuterField);
        }
    }

    public static void main(String[] args) {
        
        System.out.println("Inner class:");
        System.out.println("------------");
        OuterClass outerObject = new OuterClass();  // innerclass에 접근하려면 outerclass가 만들어져야한다.
        OuterClass.InnerClass innerObject = outerObject.new InnerClass();   // oc.new innerclass()로 내부 객체 생성한 후 접근 가능
        innerObject.accessMembers();

        System.out.println("\nStatic nested class:");
        System.out.println("--------------------");
        StaticNestedClass staticNestedObject = new StaticNestedClass();   // 바로 만들고 바로 쓸 수 있음     
        staticNestedObject.accessMembers(outerObject);

        System.out.println("\nTop-level class:");
        System.out.println("--------------------");
        TopLevelClass topLevelObject = new TopLevelClass();        
        topLevelObject.accessMembers(outerObject);                
    }
    
    class TopLevelClass {   // static 영역에 생성됨
        void accessMembers(OuterClass outer) {     
        // System.out.println(OuterClass.outerField);   // 객체가 생성되어야지 non-static field에 접근가능함.(직접 접근은 불가능) OuterClass.staticFiled 이런건 가능함.
        System.out.println(outer.outerField);   // 객체를 통해 접근 가능
        System.out.println(OuterClass.staticOuterField);    // static이니까 바로 접근 가능
        }  
    }
}