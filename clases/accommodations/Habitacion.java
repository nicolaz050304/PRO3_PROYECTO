package accommodations;

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

	public String getNroHabitacion() {
		return nroHabitacion;
	}

	public void setNroHabitacion(String nroHabitacion) {
		this.nroHabitacion = nroHabitacion;
	}

	public boolean isConBanhoPrivado() {
		return conBanhoPrivado;
	}

	public void setConBanhoPrivado(boolean conBanhoPrivado) {
		this.conBanhoPrivado = conBanhoPrivado;
	}

	public String getTipoCama() {
		return tipoCama;
	}

	public void setTipoCama(String tipoCama) {
		this.tipoCama = tipoCama;
	}
}