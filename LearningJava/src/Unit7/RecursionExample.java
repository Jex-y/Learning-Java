package Unit7;

public class RecursionExample {
    public static void main(String[] args) {
        for (int i = 0; i < 101; i++) {
            System.out.printf("The sum of all numbers from 0 to %d is %d\n",i,sum(i));
        }
    }

    static int sum(int num) {
        if (num == 0) {
            return 0;
        }
        else {
            return num + sum(num-1);
        }
    }
}
