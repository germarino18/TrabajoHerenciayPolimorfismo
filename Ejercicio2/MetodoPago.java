package HerenciaYPolimorfismo.Ejercicio2;

public abstract class MetodoPago {
    protected String titular;
    protected int numero;

    //Constructor
    public MetodoPago (String titular, int numero){
        this.titular = titular;
        this.numero = numero;
    }


    public abstract void realizarPago();
}
