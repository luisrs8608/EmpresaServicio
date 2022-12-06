public class Empresa {
    private String razonSocial;

    public Empresa() {
        this.razonSocial = null;
    }

    public Empresa(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getRazonSocial() {
        return razonSocial;
    }
}
