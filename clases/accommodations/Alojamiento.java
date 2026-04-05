package accomodations;

import interfaceConsults.*;

public abstract class Alojamiento implements IConsultable{
	protected int idAlojamiento;
	protected String nombre;
	protected String descripcion;
	protected String direccion;
	protected double precioPorNoche;
	protected int capacidadMaxima;
	protected double calificacionPromedio // Rango del 1-5, basado en reseñas
	protected boolean disponibilidad;
	
	public Alojamiento(int idAlojamiento, String nombre, String descripcion, String direccion,
	double precioPorNoche, int capacidadMaxima, double calificacionPromedio, boolean disponibilidad) {
		this.idAlojamiento = idAlojamiento;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.direccion = direccion;
		this.precioPorNoche = precioPorNoche;
		this.capacidadMaxima = capacidadMaxima;
		this.calificacionPromedio = calificacionPromedio;
		this.disponibilidad = disponibilidad;
	}
	
	
}