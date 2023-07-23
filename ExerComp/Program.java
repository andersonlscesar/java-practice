package ExerComp;

import java.util.Locale;
import java.util.Scanner;

public class Program
{
    public static void main(String[] args)
    {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter department's name: ");
        String department = sc.nextLine();

        System.out.print("Enter worker dasta: ");
        String workerName = sc.nextLine();

        System.out.print("Level: ");
        String workerLevel = sc.nextLine();

        System.out.print("Base Salary: ");
        double baseSalary = sc.nextDouble();


        // Instância classe Worker
        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(department));

        System.out.print("How many contracts to this worker? ");
        int n = sc.nextInt();


        sc.close();
    }
}
