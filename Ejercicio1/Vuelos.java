package HerenciaYPolimorfismo.Ejercicio1;

public abstract class Vuelos {
    protected int numeroVuelo;
    protected String origen;
    protected String destino;
    protected String fecha;

    //Constructor
    public Vuelos(int numeroVuelo, String origen, String destino, String fecha){
        this.numeroVuelo = numeroVuelo;
        this.origen = origen;
        this.destino = destino;
        this.fecha = fecha;
    }

    //Getter
    public int getNumeroVuelo() {
        return numeroVuelo;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public String getFecha() {
        return fecha;
    }

    //Setter
    public void setNumeroVuelo(int numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public abstract void calcularPrecio();
}
