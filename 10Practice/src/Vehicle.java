public interface Vehicle {
    String getBrand();
    String speedUp();
    String slowDown();
    default String turnAlarmOn(){
        return "turn on";
    }
    default String turnAlarmOff(){
        return "turn off";
    }
}
