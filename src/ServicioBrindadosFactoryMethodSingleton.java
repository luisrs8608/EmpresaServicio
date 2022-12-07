public class ServicioBrindadosFactoryMethodSingleton {
    private static ServicioBrindadosFactoryMethodSingleton instancia;

    private ServicioBrindadosFactoryMethodSingleton() {
    }

    public static ServicioBrindadosFactoryMethodSingleton obtenerInstancia() {
        if (ServicioBrindadosFactoryMethodSingleton.instancia == null) {
            ServicioBrindadosFactoryMethodSingleton.instancia = new ServicioBrindadosFactoryMethodSingleton();
        }
        return ServicioBrindadosFactoryMethodSingleton.instancia;
    }

    public Servicios crearSeviciosBrindados(String tipo) {
        switch (tipo.toUpperCase()) {
            case "SIMPLE":
                return new ServicioSimple();
            case "COMBO":
                return new ServiciosCombos();
        }
        return null;
    }

}
