package Unit9.CatPackage;

public class Cat {
    private String name, breed, gender;
    private int hunger = 10;
    private int energy = 10;
    private int happiness = 0;

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
        if (energy < 4) {
            energy += 5;
            hunger += 3;
            happiness += 4;
        }
    }

    public void play() {
        if (energy > 3 && hunger < 8) {
            happiness += 2;
            hunger += 1;
            energy -= 1;
        }
    }

    public String get_name() {
        return name;
    }

    public void set_name(String name) {
        if (name.length() > 0) {
            this.name = name;
        }
    }

    public String getBreed() {
        return breed;
    }

    public String getGender() {
        return gender;
    }

    public int getHunger() {
        return hunger;
    }

    public int getEnergy() {
        return energy;
    }

    public int getHappiness() {
        return happiness;
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
