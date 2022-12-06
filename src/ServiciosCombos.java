import java.util.ArrayList;

public class ServiciosCombos extends Servicios{
    private ArrayList <Servicios> servicios = new ArrayList();
    private double descuento;

    public ServiciosCombos() {
    }

    public ServiciosCombos(ArrayList<Servicios> servicios, double descuento) {
        this.servicios = servicios;
        this.descuento = descuento;
    }

    public ArrayList<Servicios> getServicios() {
        return servicios;
    }

    public void setServicios(ArrayList<Servicios> servicios) {
        this.servicios = servicios;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    @Override
    public double calcularPrecio() {
        double precio = 0.0;

        for (Servicios servicio : this.servicios) {
            precio += servicio.calcularPrecio();
        }

        return precio - (precio / 100 * this.descuento);
    }
}
