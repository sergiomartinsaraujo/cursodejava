package appOrder;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entitiesEnums.OrderStatus;
import entitiesOrder.Client;
import entitiesOrder.Order;
import entitiesOrder.OrderItem;
import entitiesOrder.Product;

public class OrderProgram {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new  SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		
		
		Client client = new Client();
		
		System.out.println("Enetr client data:");
		System.out.print("Name: ");
		client.setName(sc.nextLine());
		System.out.print("Email: ");
		client.setEmail(sc.nextLine());
		System.out.print("Birth date (dd/MM/yyyy): ");
		client.setBirthDate(sdf.parse(sc.nextLine()));
		
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());
		
		Order order = new Order(new Date(), status, client);
		
		System.out.print("Houw many items to this order?");
		int n = sc.nextInt();
		for (int i =1; i<= n; i++) {
			System.out.println("Enter #"+i+ " item data: ");
			System.out.print("Product name: ");
			sc.nextLine();
			String productName = sc.nextLine();
			System.out.print("Product price: ");
			double productPrice = sc.nextDouble();
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			
			Product product = new Product(productName, productPrice);
			
			OrderItem it = new OrderItem(quantity, productPrice, product);
			
			order.addItem(it);
		}
		System.out.println(order);
		sc.close();
	}

}
