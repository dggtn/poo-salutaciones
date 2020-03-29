package salutaciones;

public class Saludo {

	private String nombre;
	
	public Saludo(String nombre) {
		
		this.nombre = nombre;
	}
	
	public String obtener() {
		
		return "Hola " + nombre;
	}
}
