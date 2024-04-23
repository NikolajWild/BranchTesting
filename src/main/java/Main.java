public class Main {
    public static void main(String[] args) {
        Dog dawg = new Dog("Dawgsen");
        Cat cawt = new Cat("Miaowfus", true);
        System.out.println(cawt.makeSound()+dawg.makeSound());
        cawt.eat("tun");
        dawg.eat("Kød");
        cawt.mood(false);
        dawg.mood(true);

        //asdasdsad;
    }


}
