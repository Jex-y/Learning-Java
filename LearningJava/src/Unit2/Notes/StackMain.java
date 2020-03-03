package Unit2.Notes;
import Unit2.Notes.Stack;

public class StackMain {
    public static void main(String[] args) {
        Stack<String> myStack = new Stack<String>(4);
        System.out.println(myStack.isEmpty());
        myStack.push("Did you ever hear the tragedy of Darth Plagueis \"the wise\"?");
        myStack.push("I thought not.");
        myStack.push("It's not a story the Jedi would tell you. It's a Sith legend.");
        myStack.push("Darth Plagueis was a Dark Lord of the Sith, so powerful and so wise he could use the Force to influence the midichlorians to create life... He had such a knowledge of the dark side that he could even keep the ones he cared about from dying.\n" +
                "The dark side of the Force is a pathway to many abilities some consider to be unnatural.\n" +
                "He became so powerful... the only thing he was afraid of was losing his power, which eventually, of course, he did. Unfortunately, he taught his apprentice everything he knew, then his apprentice killed him in his sleep. It's ironic he could save others from death, but not himself.");
        System.out.println(myStack.peek());
        System.out.println(myStack.isFull());
        System.out.println(myStack.toString());
        System.out.println(myStack.pop());
        System.out.println(myStack.toString());

    }
}
