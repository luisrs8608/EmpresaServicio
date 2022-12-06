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
}
