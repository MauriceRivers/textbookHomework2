/**
 * @Class: Paint
 * @Author: Maurice Rivers
 * @Version: 1.0
 * @Date: 05 February 2023
 * @Course: ITEC 2140 Section 05 Spring 2023
 * @Description: Calculator to find how much paint you need in gallons and quarts
 * To paint a room
 *
 */


import java.util.Scanner;

public class Paint {
    public static void main(String[]args){
        java.util.Scanner Input = new java.util.Scanner(System.in);
        System.out.println("What is the Length of the room: ");
        Double Length = Input.nextDouble();
        System.out.println("What is the height of the room: ");
        Double Height = Input.nextDouble();
        System.out.println("What is the width of the room: ");
        Double Width = Input.nextDouble();
        System.out.println("How many windows are there: ");
        int Windows = Input.nextInt();
        System.out.println("How many doors are there: ");
        int Doors = Input.nextInt();


        double GallonOfPaintSQFT = 350;
        double QuartsOfPaintSQFT = GallonOfPaintSQFT / 4;
        int WindowSQFT = 15;
        int DoorSQFT = 21;

        double DoorTotalSQFT = DoorSQFT * Doors;
        double WinSQFT = WindowSQFT * Windows;
        double AccSQFT = DoorTotalSQFT + WinSQFT;
        if(DoorSQFT < WindowSQFT){
            int tmp = DoorSQFT;
            DoorSQFT = WindowSQFT;
            WindowSQFT = tmp;

        }
        double RoomSQFT = Width * Length * 2; // Floor and ceiling
        double WallSQFT = Height * Width * 4; // 4 walls
        int TotalSQFT = (int) (RoomSQFT + WallSQFT - AccSQFT);
        double GallonsOfPaint = (TotalSQFT / GallonOfPaintSQFT);
        GallonsOfPaint = Math.ceil(GallonsOfPaint); // rounds up Gallons of paint to the integer
        double QuartsOfPaint = (TotalSQFT / QuartsOfPaintSQFT);
        System.out.println("You will need " + GallonsOfPaint + " Gallons, or " + QuartsOfPaint + " Quarts of paint");

    }
}
