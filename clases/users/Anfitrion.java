package users;

import accomodations.Alojamiento;
import interfaceConsults.*;
import java.util.List;
import java.util.ArrayList;


public class Anfitrion extends Usuario {

	private double calificacionPromedio; // reputacion del propietario basada en reseñas. Un rango del 1 al 5.
	private String cuentaBancaria; // donde va a recibir los pagos de los clientes
	private List<Alojamiento> alojamientos;
	
	
	public Anfitrion(String username,String nombre,String correo,String contraseña, String cuentaBancaria, double calificacionPromedio,
	List<Alojamiento> propiedades) {
		super(username,nombre,correo,contraseña);
		this.calificacionPromedio = calificacionPromedio;
		this.cuentaBancaria = cuentaBancaria;
		this.alojamientos = propiedades;
	}
	public void agregarAlojamiento(Alojamiento alojamiento){}

	@Override
	public void consultarDatos() {}
}