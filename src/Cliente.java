public class Cliente {
    private String documento;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String email;
    private String fechaNacimiento;
    private String direccion;
    private String movil;

    public Cliente(String documento, String nombre, String apellido1, String apellido2,
                   String email, String fechaNacimiento, String direccion, String movil) {
        this.documento = documento;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.movil = movil;
    }

    @Override
    public String toString() {
        return "Datos de Facturación del Cliente:\n" +
                "Nombre: " + nombre + " " + apellido1 + " " + apellido2 + "\n" +
                "Email: " + email + "\n" +
                "Dirección: " + direccion + "\n" +
                "Móvil: " + movil;
    }
}
