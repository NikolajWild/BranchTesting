public class Cat extends Animal{
public String name = "Miaowfus";
    public Cat(String name) {
        super(name);
    }

    public String makeSound(){
        String sound = "MIAOUW";
        return sound;
    }

    public boolean eat(String tun){
        return true;
    }

}
