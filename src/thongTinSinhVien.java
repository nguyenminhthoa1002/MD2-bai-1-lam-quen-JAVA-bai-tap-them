import java.util.Scanner;

public class thongTinSinhVien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã sinh viên: ");
        String studentId = scanner.nextLine();
        System.out.println("Nhập tên sinh viên: ");
        String studentName = scanner.nextLine();
        System.out.println("Nhập tuổi sinh viên: ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập giới tính sinh viên: ");
        String gender = scanner.nextLine();
        System.out.println("Nhập email sinh viên: ");
        String email = scanner.nextLine();
        System.out.println("Nhập SĐT sinh viên: ");
        String phone = scanner.nextLine();
        System.out.println("Nhập địa chỉ sinh viên: ");
        String address = scanner.nextLine();
        System.out.println("***************************************STUDENT INFORMATION**************************************");
        System.out.printf("%5s%5s%30s%5s%15s%5d\n","Student ID: ",studentId,"Student Name: ", studentName,"Age: ",age);
        System.out.printf("%5s%5s%30s%5s%15s%5s\n","Gender: ",gender,"Email: ", email,"Phone: ",phone);
        System.out.printf("%5s%5s","Address: ",address);
    }
}
