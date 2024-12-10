// 쓱 보기만 해
public class ShadowTest {
    public int x = 0;   // 같음
    class FirstLevel {
        public int x = 1;   // 같음
        void methodInFirstLevel(int x) {
            System.out.println("x = " + x);
            System.out.println("this.x = " + this.x);
            System.out.println("ShadowTest.this.x = " + ShadowTest.this.x);
        }
    }
    public static void main(String... args) {
        ShadowTest st = new ShadowTest();
        ShadowTest.FirstLevel fl = st.new FirstLevel();
        fl.methodInFirstLevel(23);
        }
}
// x = 23
// this.x = 1
// ShadowTest.this.x = 0
