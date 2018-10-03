package execise;
import java.util.Scanner;
public class UngDungChuyenDoiTienTe {
    public static void main(String[] args) {
        double vnd = 23.000;
        double usd;
        Scanner scanner =new Scanner(System.in);
        System.out.println("nhap vao so tien:");
        usd = scanner.nextDouble();
        double quydoi = usd * 23.000;
        System.out.println("ti gia vnd="+quydoi);

    }
}
