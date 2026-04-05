package users;
import java.util.ArrayList;
import java.util.List;

import interfaceConsults.*;
import reservation.Reserva;

public class Cliente extends Usuario{
	private String telefono;
	private String dni;
	private List<Reserva> reservas;//lista de reservas, aqui estan las pasadas y nuevas tambien xd
	
	public Cliente(String username,String correo,String contraseña,
					String nombre,String telefono,String dni){
		super(username,correo,contraseña);	
		this.nombre=nombre;
		this.telefono=telefono;
		this.dni=dni;
		this.reservas= new ArrayList<>();
	}
}