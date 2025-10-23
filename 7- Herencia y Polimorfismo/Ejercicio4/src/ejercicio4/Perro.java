package ejercicio4;
public class Perro extends Animal {
    @Override
    public void describirAnimal() {
        System.out.println("Soy un mamifero domestico de la familia de los canidos");
    }
    @Override
    public void hacerSonido() {
        System.out.println("Y hago: Guau guau!");
    }
}
