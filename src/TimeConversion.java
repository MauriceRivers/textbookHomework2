import java.util.Scanner;

/**
 * @Class: TimeConversion
 * @Author: Maurice Rivers
 * @Version: 1.0
 * @Course: ITEC 2140 Section 05 Spring 2023
 * @Written: 05 February 2023
 * @Description: Program to convert number of seconds into hours, minutes, and seconds
 */


public class TimeConversion {
    public static void main(String[]args){
        java.util.Scanner Input = new java.util.Scanner(System.in);
        System.out.print("Enter an integer for seconds: ");

        int seconds = Input.nextInt();
        int S = seconds % 60;
        int Hours = seconds / 60;
        int Minutes = Hours % 60;
        Hours = Hours / 60;

        System.out.println(Hours + " Hours, " + Minutes + " Minutes, and " + S + " Seconds");


    }
}
