package app;

public class TrigonometricalFunctions {
    public double cosine(double x) {
        double radians = Math.toRadians(x);
        return Math.cos(radians);
    }

    public double sine(double y) {
        double radians = Math.toRadians(y);
        return Math.sin(radians);
    }

    public double tangent(double z) {
        double radians = Math.toRadians(z);
        return Math.tan(radians);
    }

}