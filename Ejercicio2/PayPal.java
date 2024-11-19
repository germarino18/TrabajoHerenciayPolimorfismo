package HerenciaYPolimorfismo.Ejercicio2;

public class PayPal extends MetodoPago implements Cancelable{
    private String correoElectronico;

    //Constructor
    public PayPal(String titular, int numero, String correoElectronico){
        super(titular, numero);
        this.correoElectronico = correoElectronico;
    }

    @Override
    public void realizarPago(){

    }

    @Override
    public void cancelarPago(){

    }
}
