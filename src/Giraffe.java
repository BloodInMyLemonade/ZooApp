public class Giraffe extends Animal{
    public Giraffe(int age, String name, boolean isMale){
        super(age, name, isMale);
    }

    @Override
    public void Sound(){
        System.out.println("Noises");
    }
}
