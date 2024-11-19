package HerenciaYPolimorfismo.Ejercicio3;

public abstract class CanalNotificacion {
    protected String usuario;
    protected String mensaje;

    //Constructor
    public CanalNotificacion(String usuario, String mensaje){
        this.usuario = usuario;
        this.mensaje = mensaje;
    }

    public abstract void enviarNotificacion();
}
