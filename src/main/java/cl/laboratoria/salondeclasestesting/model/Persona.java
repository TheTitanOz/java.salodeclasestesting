package cl.laboratoria.salondeclasestesting.model;

/**
 * 
 * SuperClase Persona, nos permite crear herencias de persona a objetos subClase.
 * 
 * @author cristian-laptop
 */
public class Persona {
	
	// attr -> características
	/**
	 * Identificador principal, se conecta con la PK de la base de datos.
	 */
	protected String id;
	/**
	 * corresponde al nombre;
	 */
	protected String nombre;
	protected int edad;
	
	//constructor
	public Persona(String id, String nombre, int edad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
	}
	
	// métodos getters and setters
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	// métodos adicionales
	@Override
	public String toString() {
		return "Persona [id=" + id + ", nombre=" + nombre + ", edad=" + edad + "]";		
	}
	
}
