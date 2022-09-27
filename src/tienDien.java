import java.util.Scanner;

public class tienDien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập chỉ số tiêu thụ điện cũ: ");
        int chiSoDienCu = scanner.nextInt();
        System.out.println("Nhập chỉ số tiêu thụ điện mới: ");
        int chiSoDienMoi = scanner.nextInt();
        int chiSoTieuThuDien = chiSoDienMoi - chiSoDienCu;
        if (chiSoTieuThuDien == 0 ){
            System.out.println("Số tiền điện là: 10.000đ");
        } else if (chiSoTieuThuDien>0 && chiSoTieuThuDien<50){
            int tienDien = chiSoTieuThuDien * 700;
            System.out.printf("Số tiền điện là: %d đ",tienDien);
        } else if (chiSoTieuThuDien>=50 && chiSoTieuThuDien<=150) {
            int tienDien1 = 50 *700 + (chiSoTieuThuDien - 50)*900;
            System.out.printf("Số tiền điện là: %d đ",tienDien1);
        } else if (chiSoTieuThuDien>150) {
            int tienDien2 = 50*700 + 100*900 + (chiSoTieuThuDien - 50 -100) * 1100;
            System.out.printf("Số tiền điện là: %d đ",tienDien2);
        } else if(chiSoTieuThuDien>=300){
            int tienDien3 = 50*700 +100*900 + 150 *1100 +(chiSoTieuThuDien - 50 -100 -150) *1300;
            System.out.printf("Số tiền điện là: %d đ",tienDien3);
        }
    }
}
