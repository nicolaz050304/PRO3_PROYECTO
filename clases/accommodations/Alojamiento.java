package accomodations;

import interfaceConsults.*;
import users.Propietario;

public abstract class Alojamiento implements IConsultable{
	protected int idAlojamiento;
	protected String nombre;
	protected String descripcion;
	protected String direccion;
	protected double precioPorNoche;
	protected int capacidadMaxima;
	protected double calificacionPromedio; // Rango del 1-5, basado en reseñas
	protected boolean disponibilidad;
	protected Propietario duenho;
	
	
	public Alojamiento(int idAlojamiento, String nombre, String descripcion, String direccion,
	double precioPorNoche, int capacidadMaxima, double calificacionPromedio, boolean disponibilidad,
	Propietario duenho) {
		this.idAlojamiento = idAlojamiento;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.direccion = direccion;
		this.precioPorNoche = precioPorNoche;
		this.capacidadMaxima = capacidadMaxima;
		this.calificacionPromedio = calificacionPromedio;
		this.disponibilidad = disponibilidad;
		this.duenho = duenho;
	}


	
}