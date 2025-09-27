package act3;
public class Act3 {
    public static class Autor {
        private String nombre;
        private String nacionalidad;
        public Autor(String nombre, String nacionalidad) {
            this.nombre = nombre;
            this.nacionalidad = nacionalidad;
        }
        public String getNombre() {
            return nombre;
        }
        public String getNacionalidad() {
            return nacionalidad;
        }
        @Override
        public String toString() {
            return "Autor[" + nombre + ", " + nacionalidad + "]";
        }
    }
    public static class Editorial {
        private String nombre;
        private String direccion;
        public Editorial(String nombre, String direccion) {
            this.nombre = nombre;
            this.direccion = direccion;
        }
        public String getNombre() {
            return nombre;
        }
        public String getDireccion() {
            return direccion;
        }
        @Override
        public String toString() {
            return "Editorial[" + nombre + ", " + direccion + "]";
        }
    }
    public static class Libro {
        private String titulo;
        private String isbn;
        private Autor autor;
        private Editorial editorial;
        public Libro(String titulo, String isbn, Autor autor, Editorial editorial) {
            this.titulo = titulo;
            this.isbn = isbn;
            this.autor = autor;
            this.editorial = editorial;
        }
        public String getTitulo() {
            return titulo;
        }
        public Autor getAutor() {
            return autor;
        }
        public Editorial getEditorial() {
            return editorial;
        }
        @Override
        public String toString() {
            return "Libro[" + titulo + ", ISBN:" + isbn + ", " + autor + ", " + editorial + "]";
        }
    }
    public static void main(String[] args) {
        Autor autor = new Autor("Gabriel Garcia", "Colombiano");
        Editorial editorial = new Editorial("Ediciones ABC", "Calle Falsa 123");
        Libro libro = new Libro("Cien años de soledad", "ISBN-0001", autor, editorial);
        System.out.println(libro);
    }
}


