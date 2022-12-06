public class ServicioSimple extends Servicios {
    private double precioBase;
    private boolean incluyeColocacion;

    public ServicioSimple() {
    }

    public ServicioSimple(String nombre, String descripcion, double precioBase, boolean incluyeColocacion) {
        super(nombre, descripcion);
        this.precioBase = precioBase;
        this.incluyeColocacion = incluyeColocacion;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public boolean isIncluyeColocacion() {
        return incluyeColocacion;
    }

    public void setIncluyeColocacion(boolean incluyeColocacion) {
        this.incluyeColocacion = incluyeColocacion;
    }

    @Override
    public double calcularPrecio() {
        double precio = this.precioBase;
        if (this.incluyeColocacion){
            precio += this.precioBase * 10 / 100;
        }
        return precio;
    }
}
