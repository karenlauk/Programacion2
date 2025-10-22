package colección_caso1;
 
public class Colección_caso1 {
    public static void main(String[] args) {
        Inventario inventario = new Inventario();
    // Crear productos
        Producto p1 = new Producto("A1", "Pan", 500, 10, CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("E1", "Celular", 2500, 5, CategoriaProducto.ELECTRONICA);
        Producto p3 = new Producto("R1", "Campera", 1500, 8, CategoriaProducto.ROPA);
        Producto p4 = new Producto("H1", "Silla", 2000, 3, CategoriaProducto.HOGAR);
        Producto p5 = new Producto("A2", "Leche", 700, 15, CategoriaProducto.ALIMENTOS);
    // Agregarlos al inventario
        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);
    // Listar productos
        System.out.println("LISTA DE PRODUCTOS");
        inventario.listarProductos();
    // Buscar producto
        System.out.println("\nBUSCAR PRODUCTO (A1)");
        Producto buscado = inventario.buscarProductoPorId("A1");
        if (buscado != null) buscado.mostrarInfo();
    // Filtrar por categoría
        System.out.println("\nFILTRAR POR CATEGORÍA ALIMENTOS");
        inventario.filtrarPorCategoria(CategoriaProducto.ALIMENTOS);
    // Actualizar stock
        System.out.println("\nACTUALIZAR STOCK DE R1");
        inventario.actualizarStock("R1", 20);
    //Eliminar producto y volver a listar
        System.out.println("\nELIMINAR PRODUCTO CON ID 'H1'");
        inventario.eliminarProducto("H1");
        System.out.println("\nLISTA ACTUALIZADA DE PRODUCTOS");
        inventario.listarProductos();
    // Total de stock
        System.out.println("\nTOTAL DE STOCK");
        System.out.println("Total: " + inventario.obtenerTotalStock());
    // Producto con mayor stock
        System.out.println("\nPRODUCTO CON MAYOR STOCK");
        Producto mayor = inventario.obtenerProductoConMayorStock();
        if (mayor != null) mayor.mostrarInfo();
    // Filtrar por precio
        System.out.println("\nFILTRAR POR PRECIO ENTRE $1000 Y $3000");
        inventario.filtrarProductosPorPrecio(1000, 3000);
    // Categorías disponibles
        System.out.println("\nCATEGORÍAS DISPONIBLES");
        inventario.mostrarCategoriasDisponibles();   
    }
}
