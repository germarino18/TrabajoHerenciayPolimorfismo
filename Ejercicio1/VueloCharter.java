package HerenciaYPolimorfismo.Ejercicio1;

public class VueloCharter extends Vuelos implements Promocionable{
    private int precioTotal;

    public VueloCharter(int numeroVuelo, String origen, String destino, String fecha, int precioTotal){
        super(numeroVuelo, origen, destino, fecha);
        this.precioTotal = precioTotal;
    }

    //Getter
    public int getPrecioTotal() {
        return precioTotal;
    }

    //Setter
    public void setPrecioTotal(int precioTotal) {
        this.precioTotal = precioTotal;
    }


    @Override
    public void aplicarPromocion(){

    }

    @Override
    public void calcularPrecio() {

    }
}
