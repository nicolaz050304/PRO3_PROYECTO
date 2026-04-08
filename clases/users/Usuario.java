package users;


import interfaceConsults.*;

public abstract class Usuario implements IConsultable {
	private static int contadorId = 0;
	private int idUsuario;
	private String username;
	private String nombreCompleto;
	private String correo;
	private String contrasenha;
	
	public Usuario(String username,String nombreCompleto,String correo,String contrasenha){
		this.username=username;
		this.nombreCompleto = nombreCompleto;
		this.correo=correo;
		this.contrasenha=contrasenha;
		this.idUsuario = ++contadorId; 
		//el contador permite a que para cada usuario que se cree,
		//se añada dicho valor actual al idUsuario y luego se aumente
		// ejm: usuario 1 => idUsuario = ++contadorID = 1;
	}

	@Override
	public void consultarDatos() {}

	public int getIdUsuario() {
		return idUsuario;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getContrasenha() {
		return contrasenha;
	}

	public void setContrasenha(String contrasenha) {
		this.contrasenha = contrasenha;
	}
}