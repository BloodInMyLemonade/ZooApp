public class Dolphin extends Animal implements Aquatic{
    public Dolphin(int age, String name, boolean isMale){
        super(age, name , isMale);
    }

    @Override
    public void Sound(){
        System.out.println("KEKEKEKEEK Dolphin");
    }
    @Override
    public void AquaticPrint(){
        System.out.println("Is Aquatic Dolphin");
    }
}
