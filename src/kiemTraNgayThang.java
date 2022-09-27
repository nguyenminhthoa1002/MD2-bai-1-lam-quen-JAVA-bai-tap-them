import java.util.Scanner;

public class kiemTraNgayThang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter month: ");
        int month = scanner.nextInt();
        System.out.println("Enter year: ");
        int year = scanner.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    switch (month) {
                        case 1:
                        case 3:
                        case 5:
                        case 7:
                        case 8:
                        case 10:
                        case 12:
                            System.out.println("Month " + month+ " has 31 days");
                            break;
                        case 4:
                        case 6:
                        case 9:
                        case 11:
                            System.out.println("Month "+ month + " has 30 days");
                            break;
                        case 2:
                            System.out.println("Month " + month + " has 29 days");
                            break;
                        default:
                            System.out.println("Not exist this month");
                    }
                    System.out.printf("%d is a leap year", year);
                } else {
                    switch (month) {
                        case 1:
                        case 3:
                        case 5:
                        case 7:
                        case 8:
                        case 10:
                        case 12:
                            System.out.println("Month " + month+ " has 31 days");
                            break;
                        case 4:
                        case 6:
                        case 9:
                        case 11:
                            System.out.println("Month "+ month + " has 30 days");
                            break;
                        case 2:
                            System.out.println("Month " + month + " has 28 days");
                            break;
                        default:
                            System.out.println("Not exist this month");
                    }
                    System.out.printf("%d is NOT a leap year",year);
                }
            } else {
                switch (month) {
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                        System.out.println("Month " + month+ " has 31 days");
                        break;
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        System.out.println("Month "+ month + " has 30 days");
                        break;
                    case 2:
                        System.out.println("Month " + month + " has 29 days");
                        break;
                    default:
                        System.out.println("Not exist this month");
                }
                System.out.printf("%d is a leap year",year);
            }
        } else {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println("Month " + month+ " has 31 days");
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println("Month "+ month + " has 30 days");
                    break;
                case 2:
                    System.out.println("Month " + month + " has 28 days");
                    break;
                default:
                    System.out.println("Not exist this month");
            }
            System.out.printf("%d is NOT a leap year", year);
        }
    }
}
