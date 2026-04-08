package accommodations;

import interfaceConsults.*;

public class Habitacion extends Alojamiento {
	private String nroHabitacion;
	private String tipoCama;
	private boolean conBanhoPrivado;
	
	public Habitacion(int idAlojamiento, String nombre, String descripcion, String direccion,
	double precioPorNoche, int capacidadMaxima, double calificacionPromedio, boolean disponibilidad,
	String nroHabitacion, String tipoCama, boolean conBanhoPrivado) {
		super(idAlojamiento,nombre,descripcion,direccion,precioPorNoche,capacidadMaxima,calificacionPromedio,
		disponibilidad);
		this.nroHabitacion = nroHabitacion;
		this.tipoCama = tipoCama;
		this.conBanhoPrivado = conBanhoPrivado;
	}
}