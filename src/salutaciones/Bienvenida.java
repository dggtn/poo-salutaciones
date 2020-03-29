package salutaciones;

public class Bienvenida {

	private Saludo[] saludos;
	
	public Bienvenida(Saludo[] saludos) {
		
		this.saludos = saludos;
	}
	
	public String dar() {
		
		String saludo = "";
		
		for (int i = 0; i < saludos.length; i++) {
			
			saludo += saludos[i].obtener() + ". ";
		}
		
		return saludo;
	}
}
