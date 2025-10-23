package ejercicio4;
public class Vaca extends Animal {
    @Override
    public void describirAnimal(){
        System.out.println("Soy un mamifero herbivoro grande de la familia de los bovidos");
    }
    @Override
    public void hacerSonido() {
        System.out.println("Muuu!");
    }
}
