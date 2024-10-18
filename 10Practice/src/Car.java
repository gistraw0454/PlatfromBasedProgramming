public class Car implements Vehicle {
    private String brand;

    public Car(String brand) {
        this.brand = brand;
    }

    @Override
    public String getBrand() {
        return brand;
    }

    @Override
    public String speedUp(){
        return "speed up";
    }

    @Override
    public String slowDown() {
        return "slow down";
    }
}
