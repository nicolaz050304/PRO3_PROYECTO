public class Usuario{
	protected static long int idUsuario=0;
	protected String username;
	protected String correo;
	protected String contraseña;
	public Usuario(String username,String correo,String contraseña){
		this.username=username;
		this.correo=correo;
		this.contraseña=contraseña;
		idUsuario++;
	}
}