package Unit2.Notes;

public class Records {
    public static void main(String[] args) {
        person[] people = new person[]{
                new person("Nikhil", 16, true),
                new person("Torin",16,true),
                new person("Jack",16,true)
                };

        System.out.println("My friends are:");
        for (person friend: people) {
            if (friend.isFriend) {
                System.out.printf("\t%s, who is %d years old\n",friend.name,friend.age);
            }
        }
    }
}

class person {
    String name;
    int age;
    boolean isFriend;
    public person(String name, int age, boolean isFriend) {
        this.name = name;
        this.age = age;
        this.isFriend = isFriend;
    }

    public void birthday() {
        this.age ++;
    }
}
