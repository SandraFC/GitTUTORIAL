package juego;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class mago extends personaje{
int magia;

public mago (){
	magia=10;
	
	Date d =new Date();
	GregorianCalendar c = new GregorianCalendar();
	c.setTime(d);
	System.out.println("****Construyendo un MAGO a las " + c.get(Calendar.DAY_OF_WEEK) + " " + c.get(Calendar.DAY_OF_WEEK)+ " " + c.get(Calendar.MONTH) + " " + c.get(Calendar.DAY_OF_MONTH)+ " " + c.get(Calendar.HOUR)+ ":" + c.get(Calendar.MINUTE)+ ":" + c.get(Calendar.MILLISECOND)+ " " + "****");}

public int movimentoLucha(){
	magia=10;
	int numero = (int) (Math.random()*magia);
	System.out.println("*******HECHIZO********");
	return numero;
}

public int getVida() {
	return vida;
}

public void setVida(int vida) {
	this.vida = vida=vida + vida/10;
}

@Override
public int movimientoLucha() {
	// TODO Auto-generated method stub
	return 0;
}

}
