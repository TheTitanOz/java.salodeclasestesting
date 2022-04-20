package cl.laboratoria.salondeclasestesting;

import java.util.Scanner;

import cl.laboratoria.salondeclasestesting.model.*;

public class Main {
	
	// atributos
	private static Sala sala = new Sala(new Profesor("12345","Cristian",22,"Programador"));
	
	public static void main(String[] args) {
		
		// instanciaciones 
		
		// declaramos variables de interacción con el usuario
		Scanner scan = new Scanner(System.in);
		
		// declaramos la variable para realizar el recorrido del menú
		int opcionNumerico;
		
		do {
			System.out.println("Menú:");
			System.out.println("[1] - Agrega alumnos ");
			System.out.println("[2] - Listar alumnos ");
			System.out.println("[0] - Salir");
			System.out.print("Ingrese una opción: ");
			String opcion = scan.nextLine(); 
			
			// Verificar si el cambio de String a Int este permitido
			try {
				opcionNumerico = Integer.parseInt(opcion);
			} catch (NumberFormatException ex) {
				System.out.println("Error de transformación!"+ ex.getMessage());
				opcionNumerico = 100;
			}
			
			// instrucciones por opición
			if (opcionNumerico == 0) {
				System.out.println("Cerrando sistema.");
				//promedioNumeros("123-345-456-567");
			} else if(opcionNumerico == 1) {
				Alumno al = null;
				System.out.println("Ingrese el rut del alumno:");
				String id = scan.nextLine();
				System.out.println("Ingrese el nombre del alumno: ");
				String nombre = scan.nextLine();

				System.out.println("Ingrese la edad [número]:");
				int edad;
				try {
					String edadText = scan.nextLine();
					edad = Integer.parseInt(edadText) ;					
				} catch (NumberFormatException ex) {
					edad = -1;
				}
				
				_agregarAlumno(id, nombre, edad);
				
				System.out.println("Alumno "+nombre+" agregado existosamente.");
			} else if(opcionNumerico == 2) {
				
				// listar alumnos en base a la ubicación del arreglo, con un menú dinámico
				
				if (!sala.getAlumnos().isEmpty()) {
					
					int opcionAlumno;
					
					do {

						System.out.println("\tListado de alumnos:");
						
						// de la clase sala, obtengo el listado de alumnos, donde cada elemento (Alumno)
						// va a ser almacenado en la variable de tipo Alumno al
						//for(Alumno al: sala.getAlumnos()) {}
						for (int i =0; i<sala.getAlumnos().size(); i+=1) {
							Alumno al = sala.getAlumnos().get(i);
							System.out.println("\t["+(i+1)+"] - " +al.getNombre() +".");
						}
						System.out.println("\t[0] - Volver atrás.");
						
						// opciones del alumno
						System.out.println("Selecciones un alumno:");
						String opcionAlumnoText = scan.nextLine();

						try {
							opcionAlumno = Integer.parseInt(opcionAlumnoText);
						} catch (NumberFormatException ex) {
							System.out.println("Error de transformación!"+ ex.getMessage());
							opcionAlumno = -1;
						}
						
						// instrucciones de mi sub menú de alumnos, generado dinámicamente
						
						if (opcionAlumno == 0) {
							// volviendo al menú principal
						} else if(opcionAlumno == -1)  {
							// error de transformación
						} else if(opcionAlumno > sala.getAlumnos().size() ) {
							System.out.println("Opción incorrecta!");
						} else {
							// aquí si trabajo con mi alumno seleccionado.
							Alumno alumnoSeleccionado = sala.getAlumnos().get(opcionAlumno-1);

							System.out.println("Ingrese las 3 notas de "+alumnoSeleccionado.getNombre()+":");
							float notaUno = Float.parseFloat(scan.nextLine());
							float notaDos = Float.parseFloat(scan.nextLine());
							float notaTres = Float.parseFloat(scan.nextLine());
							float notas[] = {notaUno, notaDos, notaTres};
							
							alumnoSeleccionado.setNotas(notas);
							alumnoSeleccionado.calcularPromedio();
							
							System.out.println("Alumno. "+alumnoSeleccionado.toString());
							System.out.println(alumnoSeleccionado.listarNotas());
							
						}
						
					} while(opcionAlumno != 0);
					
				} else {
					System.out.println("No tengo alumnos registrados.");
				}
				
			} else {
				System.out.println("Opción no disponible.");
			}
			
		} while ( opcionNumerico != 0 );
		
		
		scan.close();
	}
	
	static String _agregarAlumno(String id, String nombre, int edad) {
		Alumno a;
		if (!id.equals("") && id != null) {
			a = new Alumno(id, nombre, edad);
			sala.nuevoAlumno(a);
			return "Agregado";
		} else {
			return "No agregado";
		}
	}
		
}
