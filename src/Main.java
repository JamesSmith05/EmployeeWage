import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String Again = "";
        while (Again != "n") {

            Scanner input = new Scanner(System.in);
            System.out.println("Name: ");
            String EmpName = input.next();
            System.out.println("Hours: ");
            int Hours = input.nextInt();
            System.out.println("Hourly wage: ");
            double Wage = input.nextDouble();
            int Overtime = 0;
            if (Hours > 45) {
                Overtime = Hours - 45;
                Hours = Hours - Overtime;
            }
            double PreTax = (Hours + Overtime) * Wage;

            System.out.println(EmpName + " gets payed for " + (Hours + (Overtime * 1.5)) + " hours.");
            System.out.println("That come to " + PreTax + " before tax and " + (PreTax * 0.8) + " after tax.");

            System.out.println("Do you need to calculate another employee? 'y' or 'n' ");
            Again = input.next();
        }
    }
}
