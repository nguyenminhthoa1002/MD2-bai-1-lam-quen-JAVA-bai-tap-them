import java.util.Scanner;

public class inRaSoDaoNguoc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        int tram = number/100;
        int chuc = (number%100)/10;
        int donVi = (number%100)%10;
        if (number<100 || number>1000) {
            System.out.println(" Out of ability");
        } else {
            System.out.printf("Số đảo ngược là: %d%d%d",donVi,chuc,tram);
        }
    }
}
