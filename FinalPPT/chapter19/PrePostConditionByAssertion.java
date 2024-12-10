// Assertion 사용
public class PrePostConditionByAssertion{
    public static void sort(int[] a){
        assert a!=null; // a!=null인지확인 precondition
        for(int i=0;i <a.length-1;i++){
            for(int j=0; j<a.length-1;j++){
                if(a[i]<a[j]){
                    int t = a[i];
                    a[i] = a[j];
                    a[j] = t;
                }
            }
        }
        for (int i=0; i<a.length-1;i++){
            assert a[i] >= a[i+1];  //postcondition
        }
    }
    public static void main(String[] args){
        int[] a ={10,25,20,50};
        sort(a);
    }
}