package cl.laboratoria.salondeclasestesting;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.logging.Logger;

import org.junit.jupiter.api.*;

public class MainTest {
	
	private static Main main = new Main();
	private static Logger log = Logger.getLogger(
			"cl.laboratoria.salondeclasestesting.MainTest"
	);
	
	
	@Test
	@DisplayName("Testeo de incorporación de usuario a la lista")
	void agregarUsuarioTest() {
		log.info("Se testeará el agregar un alumno a la lista.");
		String salida = main._agregarAlumno("1234-5", "Cristian", 20);
		
		// comparativa de teórico con práctico
		assertEquals("Agregado",salida);
	}
	
	
}
