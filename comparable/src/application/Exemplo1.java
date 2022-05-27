package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entities.Employee;

public class Exemplo1 {

	public static void main(String[] args) {
		
		List<Employee> list = new ArrayList<>();
		String path = "C:\\projetos eclipse\\in.txt";
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			String nome = br.readLine();
			while (nome != null) {			
			list.add(new Employee(nome));
			nome = br.readLine();
			}
			Collections.sort(list);// compara e ordena
			for (Employee s : list) {
			System.out.println(s.getName());
			}
			} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

}
