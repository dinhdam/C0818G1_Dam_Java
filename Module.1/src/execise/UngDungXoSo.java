package execise;

import java.util.Scanner;

public class UngDungXoSo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean award = false;
        boolean continueGame = false;
        int guessNumber;
        int result;
        do {
            result = (int) Math.round(Math.random()*99);
            System.out.println(result);
            System.out.println("Nhập số bất kỳ có 2 chữ số");
            guessNumber = sc.nextInt();
            if (guessNumber == result && award == false) {
                System.out.println("Bạn đã trúng $10000");
                award = true;
            } else if (UngDungXoSo.giaiNhi(guessNumber, result, award)) {
                System.out.println("Bạn đã trúng $3000");
                award = true;
            } else if (UngDungXoSo.giaiBa(guessNumber, result, award)) {
                System.out.println("Bạn đã trúng $1000");
                award = true;
            } else {
                System.out.println("Rất tiếc bạn chưa trúng giải");
            }
            sc.nextLine();
            System.out.println("Bạn có muốn chơi tiếp không (Y/N):");
            String confirmation = sc.nextLine();
            if (confirmation.equals("Y")) {
                continueGame = true;
            } else {
                continueGame = false;
            }
        } while (continueGame);
    }
    public static boolean giaiNhi(int inputNumber, int result, boolean award) {
        String inputNumberS = String.format("%02d", inputNumber);
        String resultS = String.format("%02d", result);
        return (!award && inputNumberS.charAt(0)==resultS.charAt(1) && inputNumberS.charAt(1)==resultS.charAt(0));
    }

    public static boolean giaiBa(int inputNumber, int result, boolean award) {
        String inputNumberS = String.format("%02d", inputNumber);
        String resultS = String.format("%02d", result);
        if (!award) {
            return (resultS.indexOf(inputNumberS.charAt(0)) >= 0 || resultS.indexOf(inputNumberS.charAt(1)) >= 0);
        }
        return false;
    }
    }

