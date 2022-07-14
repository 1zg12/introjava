/**
 * @author Jackie
 */
public class Car {//OOP  --> object oriented programming

    private String brand;//attribute or properties
    private String model;

    private Color color;
    //... engine
    //..

    public Car(){
    }
    public Car(String brand, String model, Color color){
        this.brand = brand;
        this.model = model;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Brand: "+ brand+"; model="+ model+"; color="+color;
    }
}


//class --> template
