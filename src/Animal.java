public abstract class Animal {

   /* class shivotno {
        void attack() { }
    }

    class kotak extends shivotno {
        void zvuk() { miao }
    }

    class kuche extends shivotno {
        void zvuk() { bau }
    } */


    private int age;
    private String name;
    private boolean isMale;

    public Animal(int age, String name, boolean isMale){
        this.age = age;
        this.name = name;
        this.isMale = isMale;
    }

    public abstract void Sound ();
    public void AnimalPrint(){
        String gender;
        if (this.isMale == true){
            gender = "male";
        } else {
            gender = "female";
        }

        System.out.println("Animal Species: " + this.getClass().getName() + " Age: " + this.age + " Name: " + this.name + " Gender is: " + gender);

        //   System.out.println(this.getClass().getName());

    }
}


