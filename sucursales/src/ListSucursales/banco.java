package ListSucursales;

public class banco {
	String empleado;
	String apellidos;
	int sucursal;
	
	public banco (String empleado, String apellidos, int sucursal) {
		this.empleado=empleado;
		this.apellidos=apellidos;
		this.sucursal=sucursal;
		
	}
	

	public int getSucursal() {
		return sucursal;
	}

	public void setSucursal(int sucursal) {
		this.sucursal = sucursal;
	}

	public String getEmpleado() {
		return empleado;
	}

	public void setEmpleado(String empleado) {
		this.empleado = empleado;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}



	
	
	
	
}
