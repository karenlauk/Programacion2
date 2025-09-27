package act2;

public class Act2 {

    public static class Bateria {
        private String modelo;
        private int capacidad;

        public Bateria(String modelo, int capacidad) {
            this.modelo = modelo;
            this.capacidad = capacidad;
        }

        public String getModelo() {
            return modelo;
        }

        public int getCapacidad() {
            return capacidad;
        }

        @Override
        public String toString() {
            return "Bateria[" + modelo + ", " + capacidad + "mAh]";
        }
    }

    public static class Celular {
        private String imei;
        private String marca;
        private String modelo;
        private Bateria bateria; // Agregación: batería viene desde afuera
        private Usuario usuario; // Asociación bidireccional

        public Celular(String imei, String marca, String modelo, Bateria bateria) {
            this.imei = imei;
            this.marca = marca;
            this.modelo = modelo;
            this.bateria = bateria;
        }

        public String getImei() {
            return imei;
        }

        public Bateria getBateria() {
            return bateria;
        }

        public Usuario getUsuario() {
            return usuario;
        }

        public void setUsuario(Usuario u) {
            if (this.usuario == u) return;
            this.usuario = u;
            if (u != null && u.getCelular() != this) u.setCelular(this);
        }

        @Override
        public String toString() {
            return "Celular[" + marca + " " + modelo + ", " + bateria + "]";
        }
    }

    public static class Usuario {
        private String nombre;
        private String dni;
        private Celular celular;

        public Usuario(String nombre, String dni) {
            this.nombre = nombre;
            this.dni = dni;
        }
        public String getNombre() {
            return nombre;
        }
        public String getDni() {
            return dni;
        }
        public Celular getCelular() {
            return celular;
        }
        public void setCelular(Celular c) {
            if (this.celular == c) return;
            this.celular = c;
            if (c != null && c.getUsuario() != this) c.setUsuario(this);
        }
        @Override
        public String toString() {
            return "Usuario[" + nombre + ", " + dni + "]";
        }
    }

    public static void main(String[] args) {
        Bateria b = new Bateria("BAT-1000", 4000);
        Celular cel = new Celular("356789012345678", "MarcaX", "ModelY", b);
        Usuario usuario = new Usuario("Carlos", "87654321");
        cel.setUsuario(usuario);
        System.out.println(cel);
        System.out.println("Usuario asociado: " + usuario);
    }
}
