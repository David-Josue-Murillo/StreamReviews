public class Cliente {
    private String clienteId;
    private String nombre;

    public Cliente(String clienteId, String nombre) {
        this.clienteId = clienteId;
        this.nombre = nombre;
    }

    public String getClienteId() {
        return clienteId;
    }

    public void setClienteId(String clienteId) {
        this.clienteId = clienteId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "clienteId='" + clienteId + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
