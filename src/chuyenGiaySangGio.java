import java.util.Scanner;

public class chuyenGiaySangGio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the seconds");
        int seconds = scanner.nextInt();
        int hours = seconds/3600;
        int minutes = (seconds%3600)/60;
        int second = (seconds%3600)%60;
        System.out.printf("Result: %d hour %d minute %d seconds",hours,minutes,second);
    }
}
