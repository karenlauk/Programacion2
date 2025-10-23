package ejercicio4;
public class Gato extends Animal {
    @Override
    public void describirAnimal(){
        System.out.println("Soy un mamifero carnivoro, domestico y depredador.");
    }
    @Override
    public void hacerSonido() {
        System.out.println("Y hago: Miau!");
    }
}