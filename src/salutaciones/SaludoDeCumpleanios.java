package salutaciones;

public class SaludoDeCumpleanios extends Saludo {

	public SaludoDeCumpleanios(String nombre) {
		
		super(nombre);
	}
	
	@Override
	public String obtener() {

		return "Feliz cumpleaños " + this.nombre + ", que pases un lindo día";
	}
}
