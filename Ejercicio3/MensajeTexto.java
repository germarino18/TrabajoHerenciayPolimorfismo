package HerenciaYPolimorfismo.Ejercicio3;

public class MensajeTexto extends CanalNotificacion implements Personalizable{
    private String numeroTelefono;

    //Constructor
    public MensajeTexto(String usuario, String mensaje, String numeroTelefono){
        super(usuario, mensaje);
        this.numeroTelefono = numeroTelefono;
    }

    @Override
    public void enviarNotificacion(){
        System.out.println("Enviando mensaje de texto a " + numeroTelefono + " con el mensaje: " + mensaje);
    }

    @Override
    public void personalizarMensaje(String nuevoMensaje){
        this.mensaje = nuevoMensaje;
    }

}
