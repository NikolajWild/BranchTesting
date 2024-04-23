public class Cat extends Animal{


    public Cat(String name, boolean erGlad) {
        super(name);

    }

    public String makeSound(){
        String sound = "miaow";
        return sound;
    }

    public boolean eat(String tun){
        return true;
    }

    @Override
    public void mood(boolean erGlad){
        if(erGlad = true){
            System.out.println("Spinder");
        }else{
            System.out.println("hvæser");
        }
    }


}

