import java.util.Scanner;

public class HienThiSoNguyenTo {
    public static void main(String[] args) {
        for (int i = 2; i < 100; i++) {
            if (i % 2 == 0) ;
            int number = 2;
            boolean check = true;
            while (number <= Math.sqrt(i)) {
                if (i % number == 0) {
                    check = false;
                }
                number = number + 1;
            }
            if (check) {
                System.out.println("cac so nguyen to nho hon 100:" + i);
            }
        }

    }
}
