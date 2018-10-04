package TinhChiSo;

import java.util.Scanner;

public class CanNang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weight;
        double height;
        double bmi;
        System.out.println("Your weight (in kilogram):");
        weight = sc.nextDouble();
        System.out.println("Your height (in meter):");
        height = sc.nextDouble();
        System.out.printf("%-20s%s", "bmi", "Interpretation\n");
        bmi = weight/height*height;
        if (bmi < 18)
            System.out.printf("%-20.2f%s", bmi, "Underweight");
        else if (bmi < 25.0)
            System.out.printf("%-20.2f%s", bmi, "Normal");
        else if (bmi < 30.0)
            System.out.printf("%-20.2f%s", bmi, "Overweight");
        else
            System.out.printf("%-20.2f%s", bmi, "Obese");
    }
}


