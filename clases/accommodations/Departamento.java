package accommodations;
import users.*;

public class Departamento extends Alojamiento {
	private int numPiso;
	private String nroDepartamento;


	public Departamento (int idAlojamiento, String nombre, String descripcion, String direccion,
						double precioPorNoche, int capacidadMaxima, double calificacionPromedio, boolean disponibilidad,
						Anfitrion duenho, int numPiso, String nroDepartamento) {
		super(idAlojamiento,nombre,descripcion,direccion,precioPorNoche,capacidadMaxima,calificacionPromedio,
		disponibilidad,duenho);
		this.numPiso = numPiso;
		this.nroDepartamento =nroDepartamento;
	}

	public int getNumPiso() {
		return numPiso;
	}

	public void setNumPiso(int numPiso) {
		this.numPiso = numPiso;
	}

	public String getNroDepartamento() {
		return nroDepartamento;
	}

	public void setNroDepartamento(String nroDepartamento) {
		this.nroDepartamento = nroDepartamento;
	}
}
