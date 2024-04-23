public class Dog extends Animal{

//sdsadsad
    public Dog(String name) {
        super(name);
    }

    public String makeSound(){
        String sound = "Wroooof";
        return sound;
    }
    public boolean eat(String kalveKød){
        return true;
    }

    @Override
    public void mood(boolean erGlad){
        if(erGlad = true){
            System.out.println("Logrer");
        }else{
            System.out.println("Knurrer");
        }
    }


}
