import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the deposit amount:");
        double depositMoney = sc.nextDouble();
        System.out.println();
        System.out.print("Enter the number of the sending month:");
        int sendingMonth = sc.nextInt();
        System.out.print("Enter  annual interest rate in percentage:");
        double interestRate = sc.nextDouble();

        double totalInterest = 0;

        for (int i = 0; i < sendingMonth; i++) {
            totalInterest += depositMoney*(interestRate/100)/12 *sendingMonth;
        }

        System.out.printf("Total of interest: %f",totalInterest);

    }

}
