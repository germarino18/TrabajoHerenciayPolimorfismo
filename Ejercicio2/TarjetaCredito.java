package HerenciaYPolimorfismo.Ejercicio2;

public class TarjetaCredito extends MetodoPago implements Cancelable {
    private String fechaExpiracion;
    private int codigoSeguridad;

    //Contstructor
    public TarjetaCredito(String titular, int numero, String fechaExpiracion, int codigoSeguridad){
        super(titular, numero);
        this.fechaExpiracion = fechaExpiracion;
        this.codigoSeguridad = codigoSeguridad;
    }

    @Override
    public void realizarPago() {
    }

    @Override
    public void cancelarPago(){

    }
}
