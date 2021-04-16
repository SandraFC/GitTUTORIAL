package juego;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public abstract class personaje {

	int vida = 100;
	
	public personaje (){
		vida=100;
		Date d =new Date();
		
		GregorianCalendar c = new GregorianCalendar();
		c.setTime(d);
		System.out.println("****Construyendo un PERSONAJE a las " + c.get(Calendar.DAY_OF_WEEK) + " " + c.get(Calendar.DAY_OF_WEEK)+ " " + c.get(Calendar.MONTH) + " " + c.get(Calendar.DAY_OF_MONTH)+ " " + c.get(Calendar.HOUR)+ ":" + c.get(Calendar.MINUTE)+ ":" + c.get(Calendar.MILLISECOND)+ " " + "****");	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}
	
	public abstract int movimientoLucha();
}
