package edu.sdccd.cisc190;

public class ComputeArea {
    public static final double PI = 3.14159265358979323846;

    /** Main method */
    public static void main(String[] args) {
        double radius;
        double area;

        // Assign a radius
        radius = 20;

        // Compute area
        area = radius * radius * 3.14159;

        // Display results
        System.out.printf("The area for the circle of radius %.2f is %.2f", radius, area);
    }
}
