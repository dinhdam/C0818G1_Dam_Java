import java.util.Scanner;

public class GiaiPhuongTrinhBac2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao so a :");
        double a = scanner.nextDouble();
        System.out.println("nhap vao so b:");
        double b = scanner.nextDouble();
        System.out.println("nhap vao so c:");
        double c = scanner.nextDouble();
        double detal = b * b - 4 * a * c;
        if (detal > 0) {
            double r1 = (-b + Math.sqrt(detal)) / (2 * a);
            double r2 = (-b - Math.sqrt(detal)) / (2 * a);
            System.out.println("ket qua cua nghiem 1=" + r1);
            System.out.println("ket qua cua nghiem 2=" + r2);
        } else if (detal == 0) {
            double r1 = (-b / a);
            System.out.println("ket qua cua nghiem =" + r1);

        } else {
            System.out.println("phuong trinh vo nghiem");
        }


    }
}
