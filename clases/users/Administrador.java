package users;

import java.util.Date;

public class Administrador extends Usuario {
    private int nivelAcceso;
    private Date fechaContratacion;

    public Administrador(String username, String nombreCompleto, String correo, String contraseña,
                         int nivelAcceso, Date fechaContratacion) {
        super(username, nombreCompleto, correo, contraseña);
        this.nivelAcceso = nivelAcceso;
        this.fechaContratacion = fechaContratacion;
    }


    @Override
    public void consultarDatos() {

    }

    public int getNivelAcceso() {
        return nivelAcceso;
    }

    public void setNivelAcceso(int nivelAcceso) {
        this.nivelAcceso = nivelAcceso;
    }

    public Date getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(Date fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }
}
