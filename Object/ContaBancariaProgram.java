package Object;

import java.util.Locale;
import java.util.Scanner;

public class ContaBancariaProgram
{
    public static void main(String[] args)
    {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        System.out.println("=============== Create An Account =================");
        System.out.println();

        System.out.print("Enter account number: ");
        int conta = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter account holder: ");
        String nomeTitular = sc.nextLine();

        System.out.print("Is there an initial deposit (y/n)?: ");
        char answer = sc.next().charAt(0);

        // Verificando resposta em relação ao depósito inicial
        ContaBancaria cb;
        if (answer == 'y') {
            System.out.print("Enter a deposit value: ");
            double deposit = sc.nextDouble();
            cb = new ContaBancaria(conta, nomeTitular, deposit);
        } else {
            cb = new ContaBancaria(conta, nomeTitular);
        }

        System.out.println(cb);
        System.out.println();
        System.out.print("Enter a deposit value: ");
        double amount = sc.nextDouble();
        cb.depositar(amount);
        System.out.println();
        System.out.println("========= update ========");
        System.out.println(cb);
        System.out.println();
        System.out.print("Enter a withdraw value:  ");
        double with = sc.nextDouble();
        cb.sacar(with);
        System.out.println();
        System.out.println("========= update ========");
        System.out.println(cb);

        sc.close();
    }


}
