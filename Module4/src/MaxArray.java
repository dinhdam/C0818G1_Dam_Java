import java.util.Scanner;

public class MaxArray {
    public static void main(String[] args) {
        int size;
        int[] array = new int [20];
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size:");
            size = scanner.nextInt();
            if (size > 20) System.out.println("Size should not exceed 20");
        } while (size < 20);
        System.out.println("Property list: ");
        for (int j = 0; j < array.length ; j++) {
            System.out.print(array[j] + "\t");
        }
        int max = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
                index = j + 1;
            }
        }
        System.out.println("The largest property value in the list is " + max + " ,at position " + index);
    }
}