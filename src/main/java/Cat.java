public class Cat extends Animal{

    public Cat(String name) {
        super(name);
    }

    public String makeSound(){
        String sound = "miaow";
        return sound;
    }

    public boolean eat(String tun){
        return true;
    }

}
