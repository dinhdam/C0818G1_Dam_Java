import java.util.Scanner;

public class UngDungChoVay {
    public static void main(String[] args) {
        double money;
        int month;
        double interset_rate;
        Scanner sc = new Scanner(System.in);
        System.out.println( "nhập vào số tiền vay ");
        money = sc.nextDouble();
        System.out.println("nhập vào số tháng cho vay");
        month = sc.nextInt();
        System.out.println("nhập vào lãi suất cho vay");
        interset_rate = sc.nextDouble();
        double total_interset = 0;
        for(int i = 0; i < month; i++){
            total_interset = money * (interset_rate/100)/12 * 3;
        }
        System.out.println("Total of interset: " + total_interset);


    }
}
