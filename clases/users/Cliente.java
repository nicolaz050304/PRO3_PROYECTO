package users;
import reservation.*;
import java.util.ArrayList;
import java.util.List;

public class Cliente extends Usuario{
	private String telefono;
	private String dni;
	private List<Reserva> reservas;//lista de reservas, aqui estan las pasadas y nuevas tambien xd
	
	public Cliente(String username,String correo,String contrasenhia,
					String nombre,String telefono,String dni){
		super(username,nombre,correo,contrasenhia);
		this.telefono=telefono;
		this.dni=dni;
		this.reservas= new ArrayList<>();
	}
	@Override
	public void consultarDatos(){}

	public void agendarReserva(Reserva reserva){}
	public void mostrarReservas(String estado){}//Me ayuda para filtro o sino muestro todas
	public void consultarReserva(int codReserva){}
	public void agregarCalificacion(int codReserva){}
	public void agregarResenhia(int codResenhia){}
}