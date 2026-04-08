package users;
import java.util.ArrayList;
import java.util.List;

import interfaceConsults.IConsultable;
import reservation.Reserva;

public class Cliente extends Usuario{
	private String telefono;
	private String dni;
	private List<Reserva> reservas;//lista de reservas, aqui estan las pasadas y nuevas tambien xd
	
	public Cliente(String username,String correo,String contrasenha,
					String nombreCompleto,String telefono,String dni){
		super(username,nombreCompleto,correo,contrasenha);
		this.nombreCompleto=nombreCompleto;
		this.telefono=telefono;
		this.dni=dni;
		this.reservas= new ArrayList<>();
	}

	@Override
	public void consultarDatos(){}
	
	public void agendarReserva(Reserva reserva){}
	public void cancelarReserva(int codReserva){}
	public void mostrarReservas(String estado){}//Me ayuda para filtro o sino muestro todas
	public void consultarReserva(int codReserva){}
	public void agregarCalificacion(int codReserva){}
	public void agregarResenhia(int codResenhia){}
	
}