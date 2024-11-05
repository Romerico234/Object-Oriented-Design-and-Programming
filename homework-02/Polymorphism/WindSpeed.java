package Polymorphism;
public class WindSpeed extends Measurement implements Measurable {
    public double milesPerHour;

    public WindSpeed(double milesPerHour) {
        this.milesPerHour = milesPerHour;
    }
    
    public String getMeasure() {
        return "Measurement of wind speed is: " + milesPerHour + "mph";
    }
}
