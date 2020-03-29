package salutaciones;

public abstract class Saludo {

	protected String nombre;
	
	public Saludo(String nombre) {
		
		this.nombre = nombre;
	}
	
	public abstract String obtener();
}
