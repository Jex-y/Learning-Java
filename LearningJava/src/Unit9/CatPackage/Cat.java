package Unit9.CatPackage;

public class Cat {
    String name, breed, gender;
    int hunger = 10;
    int energy = 10;
    int happiness = 10;

    Cat(String name, String breed, String gender) {
        this.name = name;
        this.breed = breed;
        this.gender = gender;
    }

    public void eat() {
        if (hunger > 5) {
            hunger = 0;
        }
    }

    public void sleep() {

    }

    public void play() {

    }

    @Override
    public String toString() {
        String rep = String.format(
                "Cat object: \n" +
                "\tname: %s \n\tbreed: %s \n\tgender: %s \n" +
                "\thunger: %d \n\tenergy: %d \n\thappiness: %d ",
                name, breed, gender, hunger, energy, happiness);

        return rep;
    }

}
