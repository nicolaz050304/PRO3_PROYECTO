package users;
import interfaceConsults.*;

public abstract class Usuario implements IConsultable {
	private static long contadorId = 0;
	protected long int idUsuario;
	protected String username;
	protected String nombreCompleto;
	protected String correo;
	protected String contraseña;
	
	public Usuario(String username,String nombreCompleto,String correo,String contraseña){
		this.username=username;
		this.nombreCompleto = nombreCompleto;
		this.correo=correo;
		this.contraseña=contraseña;
		this.idUsuario = ++contadorId; 
		//el contador permite a que para cada usuario que se cree,
		//se añada dicho valor actual al idUsuario y luego se aumente
		// ejm: usuario 1 => idUsuario = ++contadorID = 1;
	}


}