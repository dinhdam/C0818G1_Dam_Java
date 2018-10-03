package LuyenTapSuDungBienKieuDuLieu;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hoaHoc = sc.nextInt();
        int sinhHoc = sc.nextInt();
        int vatLy =sc.nextInt();
        double tb = (hoaHoc+sinhHoc+vatLy)/3;
        System.out.println("tb="+tb);

    }
}
