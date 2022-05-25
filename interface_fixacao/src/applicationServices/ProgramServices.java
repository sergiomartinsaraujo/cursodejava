package applicationServices;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entitiesFixacao.Contract;
import entitiesFixacao.Installment;
import services.ContractService;
import services.PayPalService;

public class ProgramServices {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter contract data");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Date (dd/MM/yyyy): ");
		Date date = sdf.parse(sc.next());
		System.out.print("Contract value: ");
		Double totalValue = sc.nextDouble();

		Contract contract = new Contract(number, date, totalValue);

		System.out.print("Enter number of installments: ");
		int N = sc.nextInt();
		ContractService cs = new ContractService(new PayPalService());

		cs.processContract(contract, N);
		System.out.println("Installments:");
		for (Installment it : contract.getInstallments()) {
			System.out.println(it);
		}

	}

}
