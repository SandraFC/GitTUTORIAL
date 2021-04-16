package juego;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class GuerreroFuerte extends guerrero{
	public GuerreroFuerte (){
		vida=100;
		Date d =new Date();
		
		GregorianCalendar c = new GregorianCalendar();
		c.setTime(d);
		System.out.println("****Construyendo un GUERREROFUERTE a las " + c.get(Calendar.DAY_OF_WEEK) + " " + c.get(Calendar.DAY_OF_WEEK)+ " " + c.get(Calendar.MONTH) + " " + c.get(Calendar.DAY_OF_MONTH)+ " " + c.get(Calendar.HOUR)+ ":" + c.get(Calendar.MINUTE)+ ":" + c.get(Calendar.MILLISECOND)+ " " + "****");
	}
	
	public int movimentoLucha(int numero){
		numero=numero+5;
		return numero;
	}
	
	
	
}
