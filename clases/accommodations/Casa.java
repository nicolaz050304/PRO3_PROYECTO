package accomodations;

import interfaceConsults.*;
import users.Anfitrion;

public class Casa extends Alojamiento {
	private int numPisos;
	private boolean conPatio;
	private int nroCocheras;
	
	public Casa(int idAlojamiento, String nombre, String descripcion, String direccion,
	            double precioPorNoche, int capacidadMaxima, double calificacionPromedio, boolean disponibilidad,
	            Anfitrion duenho, int numPisos, boolean conPatio, int nroCocheras) {
		super(idAlojamiento,nombre,descripcion,direccion,precioPorNoche,capacidadMaxima,calificacionPromedio,
		disponibilidad,duenho);
		this.numPisos = numPisos;
		this.conPatio = conPatio;
		this.nroCocheras = nroCocheras;
	}
	@Override
	public  void consultarDatos(){}
}