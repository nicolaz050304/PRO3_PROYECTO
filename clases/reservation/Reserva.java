package reservation;

import java.util.Date;
import accommodations.*;
import users.*;
import enums.*;


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
		this.cliente = cliente;
		this.montoTotal = 0;
	}

	public int getIdReserva() {
		return idReserva;
	}

	public void setIdReserva(int idReserva) {
		this.idReserva = idReserva;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	public EstadoDeReserva getEstado() {
		return estado;
	}

	public void setEstado(EstadoDeReserva estado) {
		this.estado = estado;
	}

	public Alojamiento getAlojamientoReservado() {
		return alojamientoReservado;
	}

	public void setAlojamientoReservado(Alojamiento alojamientoReservado) {
		this.alojamientoReservado = alojamientoReservado;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public double getMontoTotal() {
		return montoTotal;
	}

}