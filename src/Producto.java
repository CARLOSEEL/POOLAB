public class Producto {
    private String nombreProducto;
    private String marca;
    private String codigoProducto;
    private double precio;
    private int stock;

    public Producto(String nombreProducto, String marca, String codigoProducto,
                    double precio, int stock) {
        this.nombreProducto = nombreProducto;
        this.marca = marca;
        this.codigoProducto = codigoProducto;
        this.precio = precio;
        this.stock = stock;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public String getMarca() {
        return marca;
    }
}
