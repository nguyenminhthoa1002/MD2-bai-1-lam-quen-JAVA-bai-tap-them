import java.util.Scanner;

public class dienTichVaChuViHinhVuong {
    public static void main(String[] args) {
        System.out.println("Nhập độ dài cạnh hình vuông");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        if (a>0) {
            double chuVi = 4*a;
            double dienTich = Math.pow(a,2);
            System.out.printf("Chu vi hình vuông là: %f\n", chuVi);
            System.out.printf("Diện tích hình vuông là: %f",dienTich);
        } else {
            System.out.println("Không tồn tại hình vuông này");
        }

    }
}
