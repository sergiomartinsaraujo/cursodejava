package applicationArquivos;

import java.io.File;
import java.util.Scanner;

public class ManipulandoPastas {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a folder path:");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		File[] folders = path.listFiles(File ::isDirectory);
		System.out.println("FOLDERS:");
		for (File folder : folders) {
			System.out.println(folder);
		}
		
		File[] files = path.listFiles(File::isFile);
		System.out.println("FILES:");
		for (File file : files) {			
			System.out.println(file);
		}
		
		boolean success = new File (strPath + "\\subdir").mkdir();
		System.out.println("Directory created successfuly: " + success);
		
		//mostrando o nome da pasta
		System.out.println("Enter a folder path:");
		
		File pathFile = new File( sc.nextLine());
		System.out.println("getName: "+ pathFile.getName());
		System.out.println("getParent: "+ pathFile.getParent());
		System.out.println("getPath: "+ pathFile.getPath());
		
		sc.close();

	}

}
