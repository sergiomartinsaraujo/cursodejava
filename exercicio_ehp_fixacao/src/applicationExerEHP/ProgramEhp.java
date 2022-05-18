package applicationExerEHP;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entitiesExerEHP.Company;
import entitiesExerEHP.Individual;
import entitiesExerEHP.TaxPayer;

public class ProgramEhp {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<TaxPayer> list = new ArrayList<>();

		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		for (int i = 1; i<= n; i++) {
			System.out.println("Tax payer #"+ i +" data:");
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Anual income: ");
			double anualIncome = sc.nextDouble();
			if (ch == 'i') {
				System.out.print("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();
				list.add(new Individual(name, anualIncome, healthExpenditures));
			}else {
				System.out.print("Number of employees: ");
				int numberOfEmployee = sc.nextInt();
				list.add(new Company(name, anualIncome, numberOfEmployee));
			}
		}
		System.out.println();
		System.out.println("TAXES PAID:");
		for (TaxPayer t : list) {
			System.out.println(t.getName() 
			+ " $ "
			+ String.format("%.2f", t.tax()));

		}
		double sum = 0;
		for (TaxPayer t : list) {
			sum += t.tax();

		}
		System.out.println();
		System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));
	}

}
