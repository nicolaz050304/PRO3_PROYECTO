package accommodations;

//import interfaceConsults.*;
import users.Anfitrion;

public abstract class Alojamiento{
	protected int idAlojamiento;
	protected String nombre;
	protected String descripcion;
	protected String direccion;
	protected double precioPorNoche;
	protected int capacidadMaxima;
	protected double calificacionPromedio; // Rango del 1-5, basado en reseñas
	protected boolean disponibilidad;
	protected Anfitrion duenho;

	public int getIdAlojamiento() {
		return idAlojamiento;
	}

	public void setIdAlojamiento(int idAlojamiento) {
		this.idAlojamiento = idAlojamiento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public double getPrecioPorNoche() {
		return precioPorNoche;
	}

	public void setPrecioPorNoche(double precioPorNoche) {
		this.precioPorNoche = precioPorNoche;
	}

	public int getCapacidadMaxima() {
		return capacidadMaxima;
	}

	public void setCapacidadMaxima(int capacidadMaxima) {
		this.capacidadMaxima = capacidadMaxima;
	}

	public double getCalificacionPromedio() {
		return calificacionPromedio;
	}

	public void setCalificacionPromedio(double calificacionPromedio) {
		this.calificacionPromedio = calificacionPromedio;
	}

	public boolean isDisponibilidad() {
		return disponibilidad;
	}

	public void setDisponibilidad(boolean disponibilidad) {
		this.disponibilidad = disponibilidad;
	}

	public Anfitrion getDuenho() {
		return duenho;
	}

	public void setDuenho(Anfitrion duenho) {
		this.duenho = duenho;
	}

	public Alojamiento(int idAlojamiento, String nombre, String descripcion, String direccion,
	                   double precioPorNoche, int capacidadMaxima, double calificacionPromedio, boolean disponibilidad,
	                   Anfitrion duenho) {
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

	public abstract void consultarDatos();

}