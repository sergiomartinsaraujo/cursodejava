package Datas;

import java.util.Calendar;

public class Aula87Calendar {

	public static void main(String[] args) {
		
		//instanciando o objeto hoje do tipo Calendar 
		//e recebendo a data atual.
		Calendar hoje = Calendar.getInstance();//singleton
		System.out.println(hoje.getTime());
		//Fri May 06 21:10:29 BRT 2022
		int ano = hoje.get(Calendar.YEAR);
		System.out.println(ano);
		//2022
		int mes = hoje.get(Calendar.MONTH);
		//o método month retorna o mês do ano, sendo que janeiro = 0,		
		//fevereiro = 1, até dezembro = 11.
		System.out.println("Mês: " + mes);//
		//4
		
		int diaNoAno = hoje.get(Calendar.DAY_OF_YEAR);
		System.out.println("Dia no ano: " + diaNoAno);
		//Dia no ano: 126
		int diaNoMes = hoje.get(Calendar.DAY_OF_MONTH);
		System.out.println("Dia no mês: " + diaNoMes);
		//Dia no mês: 6
		int diaNaSemana = hoje.get(Calendar.DAY_OF_WEEK);
		System.out.println("Dia na semana: " + diaNaSemana);
		//Dia na semana: 6
		int hora = hoje.get(Calendar.HOUR_OF_DAY);
		System.out.println("Hora: "+ hora);
		//Hora: 21
		int minutos = hoje.get(Calendar.MINUTE);
		System.out.println("Minutos: "+ minutos);
		//minutos: 10
		int segundos = hoje.get(Calendar.SECOND);
		System.out.println("Segundos: "+ segundos);
		//Segundos : 29
		System.out.printf("Hoje é: %02d/%02d/%d %02d:%02d:%02d\n%n", diaNoMes,
				(mes + 1), ano, hora, minutos, segundos);
		//Hoje é: 06/05/2022 21:27:57
		
		//adicionar ou subtrair dia, mes, ano,etc.
		hoje.add(Calendar.DAY_OF_MONTH, +5);
		System.out.println(hoje.get(Calendar.DAY_OF_MONTH));
		//mudou pra dia 11.
		
		//Há vários outros parâmetros que podem ser utilizados
		//para configurar a data.
	}

}
