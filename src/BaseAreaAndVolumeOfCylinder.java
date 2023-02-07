/**
 *  @Class: BaseAreaAndVolumeOfCylinder
 *  @Author: Maurice Rivers
 *  @Version: 1.0
 *  @Course: ITEC 2140 Section 05 Spring 2023
 *  @Written: 05 February 2023
 *  @Description: Program to calculate base area and volume of a cylinder, given the length and radius of the cylinder
 */




import java.util.Scanner;

public class BaseAreaAndVolumeOfCylinder {
    public static void main(String[]args){
        java.util.Scanner Input = new java.util.Scanner(System.in);
        System.out.println("Enter the radius of the Cylinder: ");
        double Radius = Input.nextDouble();
        System.out.println("Enter the length of the cylinder: ");
        double Length = Input.nextDouble();



        double RadiusSquare = Radius * Radius;

        double BaseArea = 3.1416 * RadiusSquare;
        double Volume = 3.1416 * RadiusSquare * Length;

        System.out.println("The Base area of the Cylinder is " + BaseArea + " and the Volume is " + Volume);
    }


}
