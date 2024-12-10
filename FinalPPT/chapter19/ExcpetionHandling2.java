public class ExcpetionHandling2{
    private static double badCode(int a[],int y) throws Exception{
        try{
            int x = a[y];
            return x;
        }
        catch(Exception e){
            throw e;
        }
    }

    public static void main(String[] args){
        try{
            bacCode({0,1,2},3);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}