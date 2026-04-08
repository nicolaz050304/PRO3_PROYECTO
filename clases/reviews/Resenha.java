package reviews;

import accommodations.*;
import users.Cliente;
import java.util.Date;

public class Resenha {

    // --- Atributos
    private int idResenha;
    private Cliente autor;
    private Alojamiento alojamiento;
    private int calificacion;
    private String comentario;
    private Date fechaPublicacion;


    public Resenha(int idResenha, Cliente autor, Alojamiento alojamiento, int calificacion, String comentario, Date fechaPublicacion) {
        this.idResenha = idResenha;
        this.autor = autor;
        this.alojamiento = alojamiento;
        this.calificacion = calificacion;
        this.comentario = comentario;
        this.fechaPublicacion = fechaPublicacion;
    }

    // --- Getters y Setters 
    public int getIdResenha() { 
		return idResenha; 
	}
    public void setIdResenha(int idResenha) {
		this.idResenha = idResenha; 
	}

    public Cliente getAutor() { 
	return autor; 
	}
    public void setAutor(Cliente autor) {
		this.autor = autor; 
	}

    public Alojamiento getAlojamiento() { 
	return alojamiento; 
	}
    public void setAlojamiento(Alojamiento alojamiento) {
		this.alojamiento = alojamiento; 
	}

    public int getCalificacion() { 
	return calificacion; 
	}
    public void setCalificacion(int calificacion) {
		this.calificacion = calificacion;
	}

    public String getComentario() {
		return comentario; 
	}
    public void setComentario(String comentario) {
		this.comentario = comentario; 
	}

    public Date getFechaPublicacion() { 
		return fechaPublicacion;
	}
    public void setFechaPublicacion(Date fechaPublicacion) {
		this.fechaPublicacion = fechaPublicacion;
	}

    // --- Metodos -> solo estan declarados
    public void editarResenha(String nuevoComentario, int nuevaCalificacion) {
    }

    public void eliminarResenha() {
    }
}
