package accommodations;

import interfaceConsults.*;

public class Casa extends Alojamiento {
	private int numPisos;
	private boolean conPatio;
	private int nroCocheras;
	
	public Casa(int idAlojamiento, String nombre, String descripcion, String direccion,
	double precioPorNoche, int capacidadMaxima, double calificacionPromedio, boolean disponibilidad,
	int numPisos, boolean conPatio, int nroCocheras) {
		super(idAlojamiento,nombre,descripcion,direccion,precioPorNoche,capacidadMaxima,calificacionPromedio,
		disponibilidad);
		this.numPisos = numPisos;
		this.conPatio = conPatio;
		this.nroCocheras = nroCocheras;
	}
}