package tema5;

public class vehiculo {
	
		String matricula;
		String dni;
		String diasemana;


		public vehiculo (String matricula, String dni, String diasemana) {
			
			this.matricula=matricula;
			this.dni=dni;
			this.diasemana=diasemana;
					
		}
	

		public String getMatricula() {
			return matricula;
		}


		public void setMatricula(String matricula) {
			this.matricula = matricula;
		}


		public String getDni() {
			return dni;
		}


		public void setDni(String dni) {
			this.dni = dni;
		}


		public String getDiasemana() {
			return diasemana;
		}


		public void setDiasemana(String diasemana) {
			this.diasemana = diasemana;
		}


	


}
