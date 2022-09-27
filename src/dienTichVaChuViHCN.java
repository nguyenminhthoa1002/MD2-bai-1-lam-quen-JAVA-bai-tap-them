import java.util.Scanner;

public class dienTichVaChuViHCN {
    public static void main(String[] args) {
        System.out.println("Nhập chiều dài hình chữ nhật: ");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        System.out.println("Nhập chiều rộng hình chữ nhật: ");
        double b = scanner.nextDouble();
        if (a>0 && b>0) {
            double chuVi = (a+b)*2;
            double dienTich = a*b;
            System.out.printf("Chu vi hình chữ nhật là: %f\n",chuVi);
            System.out.printf("Diện tích hình chữ nhật là: %f",dienTich);
        } else {
            System.out.println("Không tồn tai hình chữ nhật này");
        }
    }
}
