package order;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program
{
    public static void main(String[] args) throws ParseException
    {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("------- Enter client Data --------");

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Email: ");
        String email = sc.nextLine();

        System.out.print("Birth date (DD/MM/YYYY)");
        Date birthDate = sdf.parse(sc.nextLine());

        // Creating the client object
        Client client = new Client(name, email, birthDate);

        System.out.println("------- Enter order data --------");

        System.out.print("status: ");
        String status = sc.nextLine();

        // Defining order and its client
        Order order = new Order(client, OrderStatus.valueOf(status));

        System.out.print("How many items to this order? ");
        int items = sc.nextInt();

        OrderItem orderItem = new OrderItem(items);

        for (int i = 1; i <= items; i++) {
            System.out.println("------ Enter #" + i + " item data ------");
            System.out.print("Product Name: ");
            sc.nextLine();
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            double productPrice = sc.nextDouble();
            System.out.print("Quantity: ");
            int quantity = sc.nextInt();
        }
        sc.close();
    }
}
