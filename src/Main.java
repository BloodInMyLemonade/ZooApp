import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Animal> ZooAnimals = new ArrayList<Animal>();
        System.out.println("Iskash li da zapochnesh deistivie?");
        String entrySystem = scanner.nextLine();

        while(entrySystem.equalsIgnoreCase("yes")) {
            System.out.print("Iskash li da dobavish zhivotno? ");
            String addAnimal = scanner.nextLine();

            if (!(addAnimal.equalsIgnoreCase("Y") || addAnimal.equalsIgnoreCase("yes"))) {
                break;
            }

            System.out.print("What type of animal would you like to add? ");
            String animalType = scanner.nextLine();

            System.out.print("What gender is the animal? ");
            String animalGender = scanner.nextLine();

            while (!animalGender.equalsIgnoreCase("male")
                    && !animalGender.equalsIgnoreCase("female")
                    && !animalGender.equalsIgnoreCase("man")){
                System.out.print("Invalid gender. Please try again.");
                System.out.print("What gender is the animal? ");
                animalGender = scanner.nextLine();
            }

            boolean animalIsMale;
            if (animalGender.equalsIgnoreCase("male") || animalGender.equalsIgnoreCase("man")) {
                animalIsMale = true;
            } else {
                animalIsMale = false;
            }

            System.out.print("How old is your animal? ");
            int animalAge = scanner.nextInt();
            scanner.nextLine();
            System.out.print("What's the name of your animal? ");
            String animalName = scanner.nextLine();

            switch (animalType.toLowerCase()) {
                case "dog":
                    Dog d = new Dog(animalAge, animalName, animalIsMale);
                    ZooAnimals.add(d);
                    break;
                case "cat":
                    Cat c = new Cat(animalAge, animalName, animalIsMale);
                    ZooAnimals.add(c);
                    break;
                case "dolphin":
                    Dolphin dol = new Dolphin(animalAge, animalName, animalIsMale);
                    ZooAnimals.add(dol);
                    break;
                default:
                    System.out.println("Unknown animal type");
            }

            System.out.println("Iskash li da povtorish deistivie?");
            String QuitLoop = scanner.nextLine();

            if (QuitLoop.equalsIgnoreCase("no")) {
                break;
            }
        }

        for (int i = 0; i < ZooAnimals.size(); i++) {
            Animal a = ZooAnimals.get(i);
            a.AnimalPrint();
            a.Sound();
            if (a instanceof Aquatic) {
                ((Aquatic) a).AquaticPrint();
            }
        }
        scanner.close();

    }
}