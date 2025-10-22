package colección_caso1;
public class Producto {
    private String id;
    private String nombre;
    private double precio;
    private int cantidad;
    private CategoriaProducto categoria;
// Constructor
    public Producto(String id, String nombre, double precio, int cantidad, CategoriaProducto categoria) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.categoria = categoria;
    }
// Método para mostrar la información del producto
    public void mostrarInfo() {
        System.out.println("ID: " + id +
                " | Nombre: " + nombre +
                " | Precio: $" + precio +
                " | Cantidad: " + cantidad +
                " | Categoría: " + categoria + " (" + categoria.getDescripcion() + ")");
    }
// Getters y Setters básicos
    public String getId() {
        return id;
    }
    public double getPrecio() {
        return precio;
    }
    public int getCantidad() {
        return cantidad;
    }
    public CategoriaProducto getCategoria() {
        return categoria;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
