import java.awt.*;
import java.util.Scanner;

public class ThietKeMenu {
    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1.ve hinh tam giac");
        System.out.println("2.ve hinh vuong");
        System.out.println("3.ve hinh chu nhat");
        System.out.println("0.Exit");
        System.out.println("Enter your choice:");
        choice =sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Draw the triangle");
                System.out.println("******");
                System.out.println("*****");
                System.out.println("****");
                System.out.println("***");
                System.out.println("**");
                System.out.println("*");
                break;
            case 2:
                System.out.println("Draw the square");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                break;
            case 3:
                System.out.println("Draw the rectangle");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                System.out.println("* * * * * *");
                break;
            case 0:
                System.exit(0);
            default:
                System.out.println("No choice!");
                while(choice!= 0) {

                }
        }
    }


}
