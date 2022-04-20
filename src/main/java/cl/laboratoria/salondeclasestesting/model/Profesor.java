package cl.laboratoria.salondeclasestesting.model;

public class Profesor extends Persona {

	// attr
	private String conocimiento;
	
	// constructor
	public Profesor(String id, String nombre, int edad, String conocimiento) {
		super(id, nombre, edad);
		this.conocimiento = conocimiento;
	}

	// métodos getters and setters
	public String getConocimiento() {
		return conocimiento;
	}

	public void setConocimiento(String conocimiento) {
		this.conocimiento = conocimiento;
	}

	//métodos adicionales
	@Override
	public String toString() {
		return "Profesor [conocimiento=" + conocimiento + ", id=" + id + ", nombre=" + nombre + ", edad=" + edad + "]";
	}
}
