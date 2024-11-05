package Polymorphism;

public class Client {
    public static void main(String[] args) {
        
        // Polymorphism example
        Measurable packageOne = new Package(25,2);
        Measurable rectangle = new Rectangle(5, 10);
        Measurable windSpeed = new WindSpeed(50);

        System.out.println(packageOne.getMeasure());
        System.out.println(rectangle.getMeasure());
        System.out.println(windSpeed.getMeasure());

        // Create an array of Measurable objects
        Measurable[] measurements = new Measurable[3];
        
        // Initialize with different types
        measurements[0] = new Rectangle(10.5, 20.0);
        measurements[1] = new Package(5, 8.5);
        measurements[2] = new WindSpeed(15.7);
        
        // Demonstrate polymorphism by iterating through array
        System.out.println("\nMeasurements using polymorphism:");
        for (Measurable item : measurements) {
            System.out.println(item.getMeasure());
        }



    }


}
