public class SleepMessage{
    public static void main(String args[]){
        String messages[] = {
            "1st m", "daw "
        };
        for (String message: messages){
            try{
                Thread.sleep(1000);
            }catch(Exception e){}
            System.out.println(message);
        }
    }
}