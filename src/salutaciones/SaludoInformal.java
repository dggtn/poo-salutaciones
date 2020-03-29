package salutaciones;

public class SaludoInformal extends Saludo {

	public SaludoInformal(String nombre) {
		
		super(nombre);
	}
	
	public String obtener() {
		
		return "Hola " + this.nombre;
	}
}
