public class Venta {
    private Producto producto;
    private int cantidad;
    private double subtotal;

    public Venta(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.subtotal = producto.getPrecio() * cantidad;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public double calcularTotal() {
        return subtotal;
    }
}
