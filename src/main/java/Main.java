public class Main {

    public static void main(String[] args) {

        //java --> OOP --> object oriented programming
        Car p911 = new Car("Porsche", "911", Color.RED);//object --> instance
        Car forester = new Car("Subaru", "Forester", Color.BLACK);

        System.out.println("the first car is a " + p911);
        System.out.println("the second car is a " + forester);
    }
}
