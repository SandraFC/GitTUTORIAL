package alumnos;

public class Alumno {
	
	public String nombre = " ";
	public String apellido =" ";
	private int numalumnos;
	public double notaMedia;
	
	
	
	public Alumno (String nombre, String apellido) {
		this.nombre=nombre;
		this.apellido=apellido;
		
	}
	
	public Alumno (double notaMedia) {
		this.notaMedia=notaMedia;
		
	}
	
	protected Alumno (int numalumnos) {
		this.numalumnos=numalumnos;
	}
		
	public int incrementoAlumnos() {
		int incrementoAlumnos=numalumnos++;
		numalumnos=incrementoAlumnos;
	return incrementoAlumnos;
	}
	
	public double incrementarNota() {
		double incrementarNota;
		incrementarNota=notaMedia + 5;
		notaMedia=incrementarNota;
		return incrementarNota;
	}
	public double resultadoNota() {
		double resultadoNota=notaMedia;
		return resultadoNota;
	}
	

	public Alumno(){
        nombre = "Juan";
        apellido = "Palomo";
        numalumnos++;
        //Poniendo el incremento en el instructor no puedo incrementar
	    //he probado numalumnos++; numalumnos=++numalumnos; en el set pero tampoco
        //asi que cree un metodo
        notaMedia =8.75;
	}
	 
	public Alumno(Alumno a){
        nombre = a.nombre;
        apellido = a.apellido;
	}

	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public int getNumalumnos() {
		return numalumnos;
	}
	
	public void setNumalumnos() {
		this.numalumnos = numalumnos++;
	}

	public double getNotaMedia() {
		return notaMedia;
	}

	public void setNotaMedia() {
		this.notaMedia = notaMedia;
	}

	



}
	