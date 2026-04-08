package reservation;

import interfaceConsults.*;
import java.util.Date;
import accomodations.Alojamiento;
import users.Cliente;
import ENUM.EstadoDeReserva;


public class Reserva {
	private int idReserva;
	private Date fechaInicio;
	private Date fechaFin;
	private double montoTotal;
	private EstadoDeReserva estado;
	
	private Alojamiento alojamientoReservado;
	private Cliente cliente;
	
	public Reserva(int idReserva, Date fechaInicio, Date fechaFin, EstadoDeReserva estado,
	Alojamiento alojamientoReservado, Cliente cliente) {
		this.idReserva = idReserva;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.estado = estado;
		this.alojamientoReservado = alojamientoReservado;
		this.cliente =cliente;
		this.montoTotal = 0;
	}

}