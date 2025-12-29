public class JellyFish extends Animal implements Aquatic{
    public JellyFish(int age, String name, boolean isMale){
        super(age, name , isMale);
    }

    @Override
    public void Sound(){
        System.out.println("................................................................*silence* (JellyFish)");
    }
    @Override
    public void AquaticPrint(){
        System.out.println("Is Aquatic Jellyfish");
    }
}
