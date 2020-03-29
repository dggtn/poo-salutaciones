package salutaciones;

import org.junit.Assert;
import org.junit.Test;

public class PruebaBienvenida {

	@Test
	public void darParaTresPersonas() {
		
		Saludo[] saludos = new Saludo[] {
			
				new SaludoInformal("Martín"),
				new SaludoFormal("Señor Moreno"),
				new SaludoInformal("Lucía")
		};
		
		Bienvenida bienvenida = new Bienvenida(saludos);
		
		Assert.assertEquals("Hola Martín. Buenos días Señor Moreno. Hola Lucía. ", 
							bienvenida.dar());
	}
}
