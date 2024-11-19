package HerenciaYPolimorfismo.Ejercicio3;

public class CorreoElectronico extends CanalNotificacion implements Personalizable{
    private String direccionCorreo;

    //Constructor
    public CorreoElectronico(String usuario, String mensaje, String direccionCorreo){
        super(usuario, mensaje);
        this.direccionCorreo = direccionCorreo;
    }

    @Override
    public void enviarNotificacion(){
        System.out.println("Enviando correo electrónico a " + direccionCorreo + " con el mensaje: " + mensaje);
    }

    @Override
    public void personalizarMensaje(String nuevoMensaje){
        this.mensaje = nuevoMensaje;
    }
}
