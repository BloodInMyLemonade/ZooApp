import java.util.*;

public class Main{
    static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Iskash li da dobavish zhivotno?");
        String addAnimal = scanner.nextLine();
        ArrayList<Animal> ZooAnimals = new ArrayList<Animal>();
        if (addAnimal.equals("Y") ||addAnimal.toLowerCase().equals("yes")) {
            System.out.println("What type of animal would you like to add? ");
            String animalType = scanner.nextLine();
            System.out.println("What gender is the animal? ");
            String animalGender = scanner.nextLine();
            Boolean animalIsMale;
            if (animalGender.equalsIgnoreCase("male") || animalGender.equalsIgnoreCase("man")) {
                animalIsMale = true;
            }
            else{
                animalIsMale = false;
            }
            System.out.println("How old is your animal? ");
            int animalAge = scanner.nextInt();
            scanner.nextLine();
            System.out.println("What's the name of your animal? ");
            String animalName = scanner.nextLine();
            switch(animalType.toLowerCase()){
                //dog,cat,
                case "dog":
                    Dog d = new Dog(animalAge, animalName, animalIsMale);
                    ZooAnimals.add(d);
                    break;
                case "cat":
                    Cat c = new Cat(animalAge, animalName, animalIsMale);
                    ZooAnimals.add(c);
                    break;
            }
        }
       /* Dog d = new Dog(4, "Kucho", true);
        //d.Zvuk();
        Cat c = new Cat(3, "Kot", false);
        //c.Zvuk();
        Giraffe g = new Giraffe(10, "Dulga Gusha", true);
        //g.Zvuk();
        Lion l = new Lion(8, "Simba", false);
        //l.Zvuk();
        Elephant e = new Elephant(20, "el elephanto", true);
        Fox f = new Fox(3, "Stinker", true);
        JellyFish j = new JellyFish(4, "Stinger", false);
        Dolphin dolphin = new Dolphin(6, "Waterbud", true);  */
         //System.out.println("true = ismale");
        /*
        ZooAnimals.add(d);
        ZooAnimals.add(c);
        ZooAnimals.add(l);
        ZooAnimals.add(g);
        ZooAnimals.add(e);
        ZooAnimals.add(f);
        ZooAnimals.add(dolphin);
        ZooAnimals.add(j); */
        for (int i = 0; i < ZooAnimals.size(); i++) {
            Animal a = ZooAnimals.get(i);
            a.AnimalPrint();
            a.Sound();
            //       a.getInterfaces();
            //   List<Class<?>> interfaces = Arrays.asList(a.getClass().getInterfaces());
            //a.getClass();
            List<Class<?>> interfaces = Arrays.asList(a.getClass().getInterfaces());
            //for(int z = 0; z < interfaces.length; z++ ){
            //  System.out.println(interfaces[z]);
            if (interfaces.contains(Aquatic.class)) {;
                ((Aquatic) a).AquaticPrint();
            }

        }
    }
}

//ArrayList
//public class Main {
//  int x = 5;
//}
