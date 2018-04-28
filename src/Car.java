


public abstract class Car {

    private String model;

    // constructor
    public Car(String str) {
        model = str;
    }
    
    public String sound() {
        return "Car goes vroom.";
    }
    
    public abstract String crashes();
    
}
