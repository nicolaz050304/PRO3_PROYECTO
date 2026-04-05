package users;

import interfaceConsults.*;

public class Propietario extends Usuario {
	private double calificacionPromedio; // reputacion del propietario basada en reseñas. Un rango del 1 al 5.
	private String cuentaBancaria; // donde va a recibir los pagos de los clientes
	
	public Propietario(String username,String correo,String contraseña, String cuentaBancaria, double calificacionPromedio) {
		super(username,correo,contraseña);
		this.calificacionPromedio = calificacionPromedio;
		this.cuentaBancaria = cuentaBancaria;
	}
}