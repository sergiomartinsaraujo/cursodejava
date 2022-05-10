package Datas;

import java.util.Date;

public class Aula86Date {

	public static void main(String[] args) {
//Classe Date que fora substituido pela Classe Calendar.
Date hoje = new Date();
System.out.println(hoje);
//Fri May 06 20:38:59 BRT 2022
System.out.println("Milissegundos desde 1 jan 1970: " + hoje.getTime());	
//Milissegundos desde 1 jan 1970: 1651880563525
System.out.println("Retorna o dia: " + hoje.getDate());
//Retorna o dia: 6
		
	}

}
