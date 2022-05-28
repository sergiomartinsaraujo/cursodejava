package applicationGenerics;

import java.util.Scanner;

import entitiesGenerics.PrintServiceGenerics;
import entitiesGenerics.PrintServiceInteger;
import entitiesGenerics.PrintServiceObject;
import entitiesGenerics.PrintServiceString;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//Integer
		PrintServiceInteger ps = new PrintServiceInteger();
		
		System.out.print("Houw many values?");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
		int value = sc.nextInt();
		ps.addValue(value);
		}
		
		ps.print();
		System.out.println("First: "+ ps.first());
		
		
		//String
		PrintServiceString psString = new PrintServiceString();
		
		System.out.print("Houw many values?");
		n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
		String newValue = sc.next();
		psString.addValue(newValue);
		}
		
		psString.print();
		System.out.println("First: "+ psString.first());
		
		//Object: permite adicionar qualquer tipo primitivo 
		//dentro de uma mesma lista, Ex: double, int, String, etc.
		PrintServiceObject psObject = new PrintServiceObject();
		
		System.out.print("Houw many values?");
		n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
		Object newValue = sc.next();
		psObject.addValue(newValue);
		}
		psObject.addValue("Maria");//adicionando um tipo String
		
		psObject.print();
		// necessário vazer um casting caso queira guardar 
		//algum valor em uma variável, Ex: Integer x = (Integer) psObject.first();
		System.out.println("First: "+ psObject.first());

		//Generics
		PrintServiceGenerics<Integer> psGenerics = new PrintServiceGenerics<>();
		
		System.out.print("Houw many values?");
		n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
		Integer newValue = sc.nextInt();
		psGenerics.addValue(newValue);
		}
		
		psGenerics.print();
		Integer x = psGenerics.first();
		System.out.println("First: "+ x);
		
		sc.close();
	}

}
