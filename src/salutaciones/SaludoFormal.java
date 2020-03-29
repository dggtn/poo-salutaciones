package salutaciones;

public class SaludoFormal extends Saludo {

	public SaludoFormal(String nombre) {
		
		super(nombre);
	}
	
	public String obtener() {
		
		return "Buenos días " + this.nombre;
	}
}
