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
	
	@Test
	public void darParaLucasQueCumpleañosYNayla() {
		
		Saludo[] saludos = new Saludo[] {
				
				new SaludoDeCumpleanios("Lucas"),
				new SaludoInformal("Nayla")
		};
		
		Bienvenida bienvenida = new Bienvenida(saludos);
		
		Assert.assertEquals("Feliz cumpleaños Lucas, que pases un lindo día. Hola Nayla. ",
							bienvenida.dar());
	}
}
