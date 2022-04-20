package cl.laboratoria.salondeclasestesting.model;

import java.util.ArrayList;

public class Sala {
	// atributos
	private String nombre;
	private Profesor profesor;
	private ArrayList<Alumno> alumnos;
	
	// constructores
	public Sala ( Profesor profesor ){
		this.profesor = profesor;
		this.nombre = "Introducción a Java";
		this.alumnos = new ArrayList<Alumno>(); // alumnosList está listo para recibir alumnos, pero está vacío
	}

	// metodos getters and setters
	public Profesor getProfesor() {
		return profesor;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}

	public ArrayList<Alumno> getAlumnos() {
		return alumnos;
	}

	// metodos adicionales
	@Override
	public String toString() {
		return "Sala [nombre=" + nombre + ", profesor=" + profesor.getNombre() + ", alumnos=" + alumnos + "]";
	}

	public void nuevoAlumno (Alumno nuevoAlumno) {
		this.alumnos.add(nuevoAlumno);
	}
	
	public String listarAlumnos () {
		String alumnosText = "";
		for (Alumno al : this.alumnos) {
			alumnosText += al.getNombre() + ", ";
		}
		return alumnosText;
	}
	
}
