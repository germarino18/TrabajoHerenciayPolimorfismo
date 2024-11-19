package HerenciaYPolimorfismo.Ejercicio1;

public class VueloRegular extends Vuelos implements Promocionable {
    private int numeroAsientos;

    public VueloRegular(int numeroVuelo, String origen, String destino, String fecha, int numeroAsientos) {
        super(numeroVuelo, origen, destino, fecha);
        this.numeroAsientos = numeroAsientos;
    }
    //Getter
    public int getNumeroAsientos() {
        return numeroAsientos;
    }

    //Setter
    public void setNumeroAsientos(int numeroAsientos) {
        this.numeroAsientos = numeroAsientos;
    }


    @Override
    public void aplicarPromocion(){

    }

    @Override
    public void calcularPrecio() {

    }
}

