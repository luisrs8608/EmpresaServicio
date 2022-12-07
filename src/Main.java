public class Main {
    public static void main(String[] args) {
        ServicioBrindadosFactoryMethodSingleton creador = ServicioBrindadosFactoryMethodSingleton.obtenerInstancia();
        ServicioSimple servicio1 = (ServicioSimple) creador.crearSeviciosBrindados("SIMPLE");
        servicio1.setNombre("Venta Aire Acondicionado");
        servicio1.setPrecioBase(65000.0);
        servicio1.setIncluyeColocacion(false);

        ServicioSimple servicio2 = (ServicioSimple) creador.crearSeviciosBrindados("SIMPLE");
        servicio2.setNombre("Colocación Aire Acondicionado");
        servicio2.setPrecioBase(10000.0);
        servicio2.setIncluyeColocacion(true);

        ServiciosCombos servicio3 = (ServiciosCombos) creador.crearSeviciosBrindados("COMBO");
        servicio3.setNombre("Full Aire Acondicionado");
        servicio3.agregarServicios(servicio1);
        servicio3.agregarServicios(servicio2);
        servicio3.setDescuento(10.0);

        Empresa emp = new Empresa();
        emp.setRazonSocial("test");
        emp.agregarServicios(servicio1);
        emp.agregarServicios(servicio2);
        emp.agregarServicios(servicio3);
        emp.mostrarServiciosBrindados();

    }
}