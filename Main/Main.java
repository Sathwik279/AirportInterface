package Main;

//import java.util.*;
import Clock.Clock;
import java.util.Scanner;

public class Main extends Thread {
    private static int choice;

    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("HI");
        // Thread.sleep(1500);
        System.out.println("Initializing Airport Interface");
        // Thread.sleep(1000);
        System.out.println("Initializing clock interface");
        Clock clock1 = new Clock();
        clock1.start();// created a new thread of the Clock and it is running.....
        // Thread.sleep(1000);
        // System.out.println(clock1.getTime());

        while (true) {
            System.out.println("Sir//Madam please enter your choice");
            System.out.println("1..for Time 10..for exit 2..for setTime");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("You have selected the clock interface");
                    System.out.println(clock1.getTime());
                    break;
                case 10:
                    System.exit(0);
                    break;
                case 2:
                    System.out.println("enter the hr sec and min");
                    System.out.println(clock1.setTime(sc.nextInt(),sc.nextInt(),sc.nextInt()));
                    break;
                
            }
        }
    }
}