public class Cat extends Animal{
    public Cat(int age, String name, boolean isMale) {
        super(age, name, isMale);
    }

    @Override
    public void Sound() {
        System.out.println("Meow");
    }
}
