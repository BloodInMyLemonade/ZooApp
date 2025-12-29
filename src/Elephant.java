public class Elephant extends Animal{
    public Elephant(int age, String name, boolean isMale){
        super(age, name , isMale);
    }

    @Override
    public void Sound(){
        System.out.println("BLOOOOOO");
    }
}
