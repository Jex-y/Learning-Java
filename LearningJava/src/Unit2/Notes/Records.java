package Unit2.Notes;

public class Records {
    public static void main(String[] args) {
        Person[] people = new Person[]{
                new Person("Nikhil", 16, true),
                new Person("Torin",16,true),
                new Person("Jack",16,true)
                };

        System.out.println("My friends are:");
        for (Person friend: people) {
            if (friend.isFriend) {
                System.out.printf("\t%s, who is %d years old\n",friend.name,friend.age);
            }
        }
    }
}

class Person {
    String name;
    int age;
    boolean isFriend;
    public Person(String name, int age, boolean isFriend) {
        this.name = name;
        this.age = age;
        this.isFriend = isFriend;
    }

    public void birthday() {
        this.age ++;
    }
}
