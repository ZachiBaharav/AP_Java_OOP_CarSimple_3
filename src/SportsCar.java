

// extends: "IS A" relation

public class SportsCar extends Car{

    private int speed;
    
    // constructor
    public SportsCar(String s, int v) {
        super(s);
        speed = v;
    }
    
    public String sound() {
        return "Sports car goes woosh...";
    }
    
    
    public String crashes(){
        return "Boom-splash";
    }
    
}
