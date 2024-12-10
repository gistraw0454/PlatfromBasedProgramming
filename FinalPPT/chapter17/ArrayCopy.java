public class ArrayCopy{
    public static void main(String[] args){
        int[] smallPrimes = {2,3,5,7,11,13};
        int[] swallowArr = {0,1,23,2,4,5,1};
        int[] deepArr = {0,1,23,23,5,1,1};

        swallowArr = smallPrimes;

        System.arraycopy(smallPrimes,2,deepArr,3,4);
        
        for (int v : deepArr){
            System.out.print(v+" ");
        }
    }
}