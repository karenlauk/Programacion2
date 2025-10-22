package colección_caso1;
import java.util.ArrayList;
public class Inventario {
    private ArrayList<Producto> productos;
    public Inventario() {
        productos = new ArrayList<>();
    }
// Agregar producto
    public void agregarProducto(Producto p) {
        productos.add(p);
    }
// Listar todos los productos
    public void listarProductos() {
        for (Producto p : productos) {
            p.mostrarInfo();
        }
    }
// Buscar por ID
    public Producto buscarProductoPorId(String id) {
        for (Producto p : productos) {
            if (p.getId().equalsIgnoreCase(id)) {
                return p;
            }
        }
        return null; // si no lo encuentra
    }
// Eliminar producto
    public void eliminarProducto(String id) {
        Producto p = buscarProductoPorId(id);
        if (p != null) {
            productos.remove(p);
            System.out.println("Producto eliminado correctamente.");
        } else {
            System.out.println("Producto no encontrado.");
        }
    }
// Actualizar stock
    public void actualizarStock(String id, int nuevaCantidad) {
        Producto p = buscarProductoPorId(id);
        if (p != null) {
            p.setCantidad(nuevaCantidad);
            System.out.println("Stock actualizado correctamente.");
        } else {
            System.out.println("Producto no encontrado.");
        }
    }
// Filtrar por categoría
    public void filtrarPorCategoria(CategoriaProducto categoria) {
        for (Producto p : productos) {
            if (p.getCategoria() == categoria) {
                p.mostrarInfo();
            }
        }
    }
// Obtener total de stock (sumar todas las cantidades)
    public int obtenerTotalStock() {
        int total = 0;
        for (Producto p : productos) {
            total += p.getCantidad();
        }
        return total;
    }
// Producto con mayor stock
    public Producto obtenerProductoConMayorStock() {
        if (productos.isEmpty()) return null;
        Producto mayor = productos.get(0);
        for (Producto p : productos) {
            if (p.getCantidad() > mayor.getCantidad()) {
                mayor = p;
            }
        }
        return mayor;
    }
// Filtrar por rango de precios
    public void filtrarProductosPorPrecio(double min, double max) {
        for (Producto p : productos) {
            if (p.getPrecio() >= min && p.getPrecio() <= max) {
                p.mostrarInfo();
            }
        }
    }
// Mostrar todas las categorías con descripción
    public void mostrarCategoriasDisponibles() {
        for (CategoriaProducto c : CategoriaProducto.values()) {
            System.out.println(c + " → " + c.getDescripcion());
        }
    }
}
