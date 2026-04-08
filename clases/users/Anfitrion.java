package users;

import accommodations.*;
import java.util.List;


public class Anfitrion extends Usuario {

	private double calificacionPromedio; // reputacion del propietario basada en reseñas. Un rango del 1 al 5.
	private String cuentaBancaria; // donde va a recibir los pagos de los clientes
	private List<Alojamiento> alojamientos;
	
	
	public Anfitrion(String username,String nombreCompleto, String correo,String contraseña, String cuentaBancaria, double calificacionPromedio,
	List<Alojamiento> alojamientos) {
		super(username,nombreCompleto,correo,contraseña);
		this.calificacionPromedio = calificacionPromedio;
		this.cuentaBancaria = cuentaBancaria;
		this.alojamientos = alojamientos;
	}

	public void agregarAlojamiento(Alojamiento alojamiento){}


	public double getCalificacionPromedio() {
		return calificacionPromedio;
	}

	public void setCalificacionPromedio(double calificacionPromedio) {
		this.calificacionPromedio = calificacionPromedio;
	}

	public String getCuentaBancaria() {
		return cuentaBancaria;
	}

	public void setCuentaBancaria(String cuentaBancaria) {
		this.cuentaBancaria = cuentaBancaria;
	}

	public List<Alojamiento> getAlojamientos() {
		return alojamientos;
	}

	public void setAlojamientos(List<Alojamiento> alojamientos) {
		this.alojamientos = alojamientos;
	}
}