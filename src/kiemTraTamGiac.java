import java.util.Scanner;

public class kiemTraTamGiac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập 3 cạnh tam giác");
        System.out.println("a = ");
        double a = scanner.nextDouble();
        System.out.println("b = ");
        double b = scanner.nextDouble();
        System.out.println("c = ");
        double c = scanner.nextDouble();
        if (a>0 && b>0 && c>0) {
            if (a+b>c || b+c>a || a+c>b) {
                if (a==b && b==c) {
                    System.out.println("Tam giác đều");
                    return;
                } else if(a==b || b==c || a==c) {
                    System.out.println("Tam giác cân");
                    return;
                } else if (a*a+b*b==c*c || a*a+c*c==b*b || b*b+c*c==a*a) {
                    if (a==b || a==c || b==c) {
                        System.out.println("Tam giác vuông cân");
                        return;
                    } else {
                        System.out.println("Tam giác vuông");
                        return;
                    }
                }
                System.out.println("Tam giác thường");
            }
        }
      else {
            System.out.println("Không tồn tại tam giác này!");
        }
    }
}
