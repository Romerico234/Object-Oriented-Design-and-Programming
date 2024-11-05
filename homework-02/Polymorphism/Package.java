package Polymorphism;

public class Package extends Measurement implements Measurable {
    public double pounds;
    public double ounces;

    public Package(double pounds, double ounces) {
        this.pounds = pounds;
        this.ounces = ounces;
    }

    public String getMeasure() {
        return "Measurement of package is: " + pounds + " pounds and " + ounces + " ounces";
        }   
    }
