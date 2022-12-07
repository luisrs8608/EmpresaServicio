import java.util.ArrayList;

public class Empresa {
    private String razonSocial;
    private ArrayList<Servicios> servicios = new ArrayList();

    public Empresa() {
    }

    public Empresa(String razonSocial, ArrayList<Servicios> servicios) {
        this.razonSocial = razonSocial;
        this.servicios = servicios;
    }

    public void agregarServicios(Servicios servicio){
        this.servicios.add(servicio);
    }

    public void quitarServicios(Servicios servicio){
        this.servicios.remove(servicio);
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public ArrayList<Servicios> getServicios() {
        return servicios;
    }

    public void setServicios(ArrayList<Servicios> servicios) {
        this.servicios = servicios;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "razonSocial='" + razonSocial + '\'' +
                ", servicios=" + servicios +
                '}';
    }

    public void mostrarServiciosBrindados() {
        for (Servicios servicio : this.servicios) {
            System.out.println("Nombre: " + servicio.getNombre() + " precio: $" + servicio.calcularPrecio());
        }
    }
}
