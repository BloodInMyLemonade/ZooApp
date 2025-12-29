public class Dog extends Animal {
    public Dog(int age, String name, boolean isMale) {
        super(age, name, isMale);
    }

    @Override
    public void Sound() {
        System.out.println("Bau");
    }
}