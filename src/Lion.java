public class Lion extends Animal{
    public Lion(int age, String name, boolean isMale){
        super(age, name, isMale);
    }

    @Override
    public void Sound(){
        System.out.println("ROARRR");
    }

}
