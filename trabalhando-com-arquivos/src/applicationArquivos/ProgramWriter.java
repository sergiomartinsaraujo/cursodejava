package applicationArquivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ProgramWriter {

	public static void main(String[] args) {
		String[] lines = new String[] { "Good morning", "Good affternoon", "Good nigth" };
		
		String path = "c:\\projetos eclipse\\out.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
			
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		}catch (IOException e) {
			e.printStackTrace();
		}
	
 path = "C:\\projetos eclipse\\out.txt";
		
		try ( BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();

			while (line != null) {
				System.out.println(line);
				line = br.readLine();

			}
		}
		catch (IOException e) {
			System.out.println("error: " + e.getMessage());
		}
	}

}
