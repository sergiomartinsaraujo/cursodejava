package Datas;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Aula88GregorianCalendar {

	public static void main(String[] args) {
		//Classe GregorianCalendar instancia a Classe Calendar
		//e � utilizada quando queremos saber se um ano � bisexto.
		Calendar hoje1 = Calendar.getInstance();
		
		GregorianCalendar hoje = new GregorianCalendar();
		
		imprimirData(hoje);
		//Hoje �: 07/05/2022 08:41:33
		
		System.out.println(hoje.isLeapYear(2022));
		//retorna se o ano � bisexto
		//false
		
		//Classe GregorianCalendar passando par�mentros
		GregorianCalendar hoje2 = new GregorianCalendar(2022,4,7);
		imprimirData(hoje2);
		//Hoje �: 07/05/2022 00:00:00
		GregorianCalendar hoje3 = new GregorianCalendar(2022,4,7,10,25,52);
		imprimirData(hoje3);
		//Hoje �: 07/05/2022 10:25:52
	}
	
	//M�todo imprimirData passando a classe Calendar
	private static void imprimirData(Calendar hoje) {
	int ano = hoje.get(Calendar.YEAR);
	int mes = hoje.get(Calendar.MONTH);
	int diaNoMes = hoje.get(Calendar.DAY_OF_MONTH);
	int hora = hoje.get(Calendar.HOUR_OF_DAY);
	int minutos = hoje.get(Calendar.MINUTE);
	int segundos = hoje.get(Calendar.SECOND);
	
	System.out.printf("Hoje �: %02d/%02d/%d %02d:%02d:%02d%n", diaNoMes,
			(mes + 1), ano, hora, minutos, segundos);
	}
	}
