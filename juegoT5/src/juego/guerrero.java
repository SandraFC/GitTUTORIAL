package juego;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class guerrero extends personaje{
	
	int ataque;
	
	public guerrero (){
		ataque=10;
		Date d =new Date();
		
		GregorianCalendar c = new GregorianCalendar();
		c.setTime(d);
		System.out.println("****Construyendo un GUERRERO a las " + c.get(Calendar.DAY_OF_WEEK) + " " + c.get(Calendar.DAY_OF_WEEK)+ " " + c.get(Calendar.MONTH) + " " + c.get(Calendar.DAY_OF_MONTH)+ " " + c.get(Calendar.HOUR)+ ":" + c.get(Calendar.MINUTE)+ ":" + c.get(Calendar.MILLISECOND)+ " " + "****");	}
	
	public int movimentoLucha(int ataque){
		ataque=10;
		int numero = (int) (Math.random()*ataque);
		System.out.println("*******ESPADAZO*******");
		return numero;
	}

	@Override
	public int movimientoLucha() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
