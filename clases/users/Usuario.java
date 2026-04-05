package users;
import interfaceConsults.*

public abstract class Usuario {
	private static long contadorId = 0;
	protected long int idUsuario;
	protected String username;
	protected String correo;
	protected String contraseña;
	public Usuario(String username,String correo,String contraseña){
		this.username=username;
		this.correo=correo;
		this.contraseña=contraseña;
		this.idUsuario = ++contadorId; 
		//el contador permite a que para cada usuario que se cree,
		//se añada dicho valor actual al idUsuario y luego se aumente
		// ejm: usuario 1 => idUsuario = ++contadorID = 1;
	}
}