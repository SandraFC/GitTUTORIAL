package medudiaT7;

public class menudiario {
	String diasemana;
	String primero;
	String segundo;
	String postre;
	int comensales;

	
	public menudiario (String diasemana, String primero, String segundo, String postre, int comensales) {
		this.diasemana=diasemana;
		this.primero=primero;
		this.segundo=segundo;
		this.postre=postre;
		this.comensales=comensales;
	}
	

public String getDiasemana() {
		return diasemana;
	}


	public void setDiasemana(String diasemana) {
		this.diasemana = diasemana;
	}


	public String getPrimero() {
		return primero;
	}


	public void setPrimero(String primero) {
		this.primero = primero;
	}


	public String getSegundo() {
		return segundo;
	}


	public void setSegundo(String segundo) {
		this.segundo = segundo;
	}


	public String getPostre() {
		return postre;
	}


	public void setPostre(String postre) {
		this.postre = postre;
	}


	public int getComensales() {
		return comensales;
	}


	public void setComensales(int comensales) {
		this.comensales = comensales;
	}

}
