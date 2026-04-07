package reservation;
import package ENUM;
import users.*;
import accommodations.*;
import interfaceConsults.*;
import java.util.Date;

public class Reserva {
	private int idReserva;
	private Date fechaInicio;
	private Date fechaFin;
	private double montoTotal;
	private Estado estado;
	
	private Alojamiento alojamientoReservado;
	private Cliente cliente;
	
	public Reserva(int idReserva, Date fechaInicio, Date fechaFin, Estado estado,
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