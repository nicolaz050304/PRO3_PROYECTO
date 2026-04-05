package accomodations;

import interfaceConsults.*;


public class Departamento extends Alojamiento {
	private int numPiso;
	private String nroDepartamento;
	
	public Departamento(int idAlojamiento, String nombre, String descripcion, String direccion,
	double precioPorNoche, int capacidadMaxima, double calificacionPromedio, boolean disponibilidad,
	int numPiso, String nroDepartamento) {
		super(idAlojamiento,nombre,descripcion,direccion,precioPorNoche,capacidadMaxima,calificacionPromedio,
		disponibilidad);
		this.numPiso = numPiso;
		this.nroDepartamento =nroDepartamento;
	}
}
