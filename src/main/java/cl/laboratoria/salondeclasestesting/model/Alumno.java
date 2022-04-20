package cl.laboratoria.salondeclasestesting.model;

public class Alumno extends Persona {
	
	// atributos
	private float[] notas;
	private float promedio;
	// anotacionesPositivas
	// anotacionesNegativas
	
	// constructores
	public Alumno(String id, String nombre, int edad) {
		super(id, nombre, edad);
		notas = new float[3];
		promedio = 1;
	}
	
	// métodos getters and setters
	/*
	public float[] getNotas() {
		return notas;
	}
	*/

	public void setNotas(float[] notas) {
		this.notas = notas;
	}

	public float getPromedio() {
		return promedio;
	}

	/*
	public void setPromedio(float promedio) {
		this.promedio = promedio;
	}
	*/
	
	// métodos adicionales
	@Override
	public String toString() {
		return "Alumno [id=" + id + ", nombre=" + nombre + ", edad=" + edad + "]";
	}
	
	public void calcularPromedio() {
		float suma = 0;
		
		for(int i=0; i<this.notas.length; i+=1) {
			suma += this.notas[i];
		}
		
		this.promedio = suma / this.notas.length;
	}
	
	public String listarNotas() {
		String notasText = "";

		for(int i=0; i<this.notas.length; i+=1) {
			notasText += this.notas[i] + ", ";
		}
		
		notasText += this.promedio +".";
		
		return notasText;
	}
	
}
