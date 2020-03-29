package salutaciones;

import org.junit.Assert;
import org.junit.Test;

public class PruebaSaludo {

	@Test
	public void obtenerParaMarina() {
		
		Saludo saludo = new SaludoInformal("Marina");
		
		Assert.assertEquals("Hola Marina", saludo.obtener());
	}
	
	@Test
	public void obtenerParaSergio() {
		
		Saludo saludo = new SaludoInformal("Sergio");
		
		Assert.assertEquals("Hola Sergio", saludo.obtener());
	}
	
	@Test
	public void obtenerParaLaSraGarcia() {
		
		Saludo saludo = new SaludoFormal("Señora García");
		
		Assert.assertEquals("Buenos días Señora García", saludo.obtener());
	}
	
	@Test
	public void obtenerParaVirginiaQueCumpleAnios() {
		
		Saludo saludo = new SaludoDeCumpleanios("Virginia");
		
		Assert.assertEquals("Feliz cumpleaños Virginia, que pases un lindo día", 
							saludo.obtener());
	}
}
