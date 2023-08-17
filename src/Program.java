import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Producto producto1 = new Producto("Laptop", "HP", "LAP123", 1200.0, 10);
        Producto producto2 = new Producto("Smartphone", "Samsung", "PHN456", 800.0, 15);
        Producto producto3 = new Producto("Tablet", "Apple", "TAB789", 600.0, 8);

        ArrayList<Producto> productosDisponibles = new ArrayList<>();
        productosDisponibles.add(producto1);
        productosDisponibles.add(producto2);
        productosDisponibles.add(producto3);

        System.out.print("Ingrese su documento: ");
        String documento = scanner.nextLine();
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese su primer apellido: ");
        String apellido1 = scanner.nextLine();
        System.out.print("Ingrese su segundo apellido: ");
        String apellido2 = scanner.nextLine();
        System.out.print("Ingrese su email: ");
        String email = scanner.nextLine();
        System.out.print("Ingrese su fecha de nacimiento: ");
        String fechaNacimiento = scanner.nextLine();
        System.out.print("Ingrese su dirección: ");
        String direccion = scanner.nextLine();
        System.out.print("Ingrese su número de móvil: ");
        String movil = scanner.nextLine();

        Cliente cliente = new Cliente(documento, nombre, apellido1, apellido2,
                email, fechaNacimiento, direccion, movil);

        System.out.println("\nProductos Disponibles:");
        for (Producto producto : productosDisponibles) {
            System.out.println(producto.getCodigoProducto() + " - " + producto.getNombreProducto() +
                    " (" + producto.getMarca() + ") - Precio: $" + producto.getPrecio());
        }

        System.out.print("\nIngrese el código del producto que desea comprar: ");
        String codigoProducto = scanner.nextLine();
        System.out.print("Ingrese la cantidad que desea comprar: ");
        int cantidad = scanner.nextInt();

        Producto productoSeleccionado = null;
        for (Producto producto : productosDisponibles) {
            if (producto.getCodigoProducto().equals(codigoProducto)) {
                productoSeleccionado = producto;
                break;
            }
        }

        if (productoSeleccionado != null) {
            if (cantidad <= productoSeleccionado.getStock()) {
                Venta venta = new Venta(productoSeleccionado, cantidad);

                System.out.println("\nDetalle de la Venta:");
                System.out.println("Producto: " + productoSeleccionado.getNombreProducto() +
                        " (" + productoSeleccionado.getMarca() + ")");
                System.out.println("Precio unitario: $" + productoSeleccionado.getPrecio());
                System.out.println("Cantidad: " + cantidad);
                System.out.println("Subtotal: $" + venta.getSubtotal());
                System.out.println("Total: $" + venta.calcularTotal());

                System.out.println("\n" + cliente);
            } else {
                System.out.println("Lo sentimos, no hay suficiente stock disponible.");
            }
        } else {
            System.out.println("Producto no encontrado.");
        }
    }
}
