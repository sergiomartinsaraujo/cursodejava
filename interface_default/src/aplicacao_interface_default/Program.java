package aplicacao_interface_default;

import java.util.Locale;
import java.util.Scanner;

import services.BrazilInterestService;
import services.InterestService;
import services.UsaInterestService;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Amount:");
		Double amount = sc.nextDouble();
		System.out.print("Months: ");
		Integer months = sc.nextInt();

		InterestService is = new BrazilInterestService(2.0);
		double payment = is.payment(amount, months);

		System.out.println("In tha Brazil payment after " + months + " months:");
		System.out.println(String.format("%.2f", payment));


		InterestService si = new UsaInterestService(1.0);
		payment = si.payment(amount, months);

		System.out.println("In the USA payment after " + months + " months:");
		System.out.println(String.format("%.2f", payment));
		sc.close();
	}

}
