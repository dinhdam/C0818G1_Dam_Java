import java.util.Scanner;

public class TimUocChung {
    public static void main(String[] args) {
     int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so a");
       a = sc.nextInt();
        System.out.println("nhap so b");
       b = sc.nextInt();
       a = Math.abs(a);
       b = Math.abs(b);
        if (a == 0 || b == 0)
            System.out.println("khong co so chung lon nhat");
        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
            System.out.println("số chung lớn nhất="+a);
        }



    }


}
