package accomodations;

import interfaceConsults.*;
import users.Anfitrion;

public class Habitacion extends Alojamiento {
	private String nroHabitacion;
	private String tipoCama;
	private boolean conBanhoPrivado;
	
	public Habitacion(int idAlojamiento, String nombre, String descripcion, String direccion,
	                  double precioPorNoche, int capacidadMaxima, double calificacionPromedio, boolean disponibilidad,
	                  Anfitrion duenho, String nroHabitacion, String tipoCama, boolean conBanhoPrivado) {
		super(idAlojamiento,nombre,descripcion,direccion,precioPorNoche,capacidadMaxima,calificacionPromedio,
		disponibilidad,duenho);
		this.nroHabitacion = nroHabitacion;
		this.tipoCama = tipoCama;
		this.conBanhoPrivado = conBanhoPrivado;
	}
	@Override
	public  void consultarDatos(){}
}