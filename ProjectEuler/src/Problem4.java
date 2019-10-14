import java.util.ArrayList;

public class Problem4 {
    public static void main(String[] args) {
        ArrayList<Long> primes = new ArrayList<>();
        primes.add(2l);
        long sum = 2;
        int index = 0;
        final int length;
        boolean done = false;
        double progress;
        for (long i = 3; i < 2e+6; i+=2) {
            done = false;
            index = 0;
            progress = (i/2e+6)*100;
            System.out.printf("\rProgress: %.2f%%    ",progress);
            while (!done && index < primes.size()) {
                if (i%primes.get(index) == 0){
                    done = true;
                }
                index ++;
            }
            if (!done) {
                primes.add(i);
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
