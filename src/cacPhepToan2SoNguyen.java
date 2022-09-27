import java.util.Scanner;

public class cacPhepToan2SoNguyen {
    public static void main(String[] args) {
        System.out.println("Nhập vào 2 số nguyên a, b");
        Scanner scanner = new Scanner(System.in);
        System.out.println("a = ");
        int a = scanner.nextInt();
        System.out.println("b = ");
        int b = scanner.nextInt();
        int tong = a+b;
        int hieu = a-b;
        int tich = a*b;
        double thuong = (double) a/(double) b;
        System.out.printf("Tổng 2 số là: %d\n",tong);
        System.out.printf("Hiệu 2 số là: %d\n",hieu);
        System.out.printf("Tích 2 số là: %d\n",tich);
        System.out.printf("Thương 2 số là %.2f",thuong);
    }
}
