package Datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Aula89SimpleDateFormat {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf1 = new SimpleDateFormat("y");
		Calendar data1 = new GregorianCalendar(2010, 2, 8);
		System.out.println(sdf1.format(data1.getTime()));
		//2010
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("d/M/y");
		Calendar data2 = new GregorianCalendar(2010, 2, 20, 14, 32, 25);
		System.out.println(sdf2.format(data2.getTime()));
		//20/3/2010
	
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy");
		Calendar data3 = new GregorianCalendar(2010, 2, 8, 14, 32, 25);
		System.out.println(sdf3.format(data3.getTime()));
		//08/03/2010
	
		SimpleDateFormat sdf4 = new SimpleDateFormat("dd/MMM/yyyy HH:mm:ss");
		Calendar data4 = new GregorianCalendar(2010, 2, 8, 14, 32, 25);
		System.out.println(sdf4.format(data4.getTime()));
		//08/Mar/2010 14:32:25
		SimpleDateFormat sdf5 = new SimpleDateFormat("dd/MMM/yyyy hh:mm:ss a z");
		Calendar data5 = new GregorianCalendar(2010, 2, 8, 14, 32, 25);
		System.out.println(sdf5.format(data5.getTime()));
		//08/Mar/2010 02:32:25 PM BRT
		
		//Possível também Instanciar a classe date
		//utilizado a classe SimpleDateFormat.
		
		Date data = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MMM/yyyy hh:mm:ss a z");
		System.out.println(sdf.format(data));
		//07/May/2022 09:37:36 AM BRT
		
		//Coverter de String para Date
		SimpleDateFormat sdf6 = new SimpleDateFormat("dd/MM/yyyy");
		String minhaData = "30/08/1980";
		Date minhaDataFormatada = sdf6.parse(minhaData);
		System.out.println(minhaDataFormatada);
		//Sat Aug 30 00:00:00 BRT 1980
		System.out.println(sdf5.format(minhaDataFormatada));
		//30/Aug/1980 12:00:00 AM BRT

	}
	
}
