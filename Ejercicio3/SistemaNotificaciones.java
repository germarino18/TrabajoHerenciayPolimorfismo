package HerenciaYPolimorfismo.Ejercicio3;

public class SistemaNotificaciones {
    public static void main(String[] args) {
        Notificaciones notificaciones = new Notificaciones();

        // Agregar canales de notificación
        CorreoElectronico correo = new CorreoElectronico("Usuario1", "Mensaje inicial", "usuario1@example.com");
        MensajeTexto mensajeTexto = new MensajeTexto("Usuario2", "Mensaje inicial", "123456789");

        notificaciones.agregarCanales(correo);
        notificaciones.agregarCanales(mensajeTexto);

        // Enviar notificaciones iniciales
        System.out.println("Enviando notificaciones iniciales:");
        notificaciones.enviarNotificaciones();

        // Personalizar mensajes
        System.out.println("\nPersonalizando mensajes...");
        notificaciones.personalizarMensajes("Este es un mensaje personalizado.");

        // Mostrar información de los canales
        System.out.println("\nInformación de los canales:");
        notificaciones.mostrarCanales();

        // Enviar notificaciones personalizadas
        System.out.println("\nEnviando notificaciones personalizadas:");
        notificaciones.enviarNotificaciones();
    }
}
