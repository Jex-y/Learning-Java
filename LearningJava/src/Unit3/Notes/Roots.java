package Unit3.Notes;

import java.io.IOException;

public class Roots {
    static final double gTOLERANCE = 1e-12;

    public static void main( String [] args) {
        divideAndConquer(121);
        heronsMethod(121    );
    }

    public static void divideAndConquer(double number) {
        boolean isComplex = number < 0;
        if (isComplex) {
            number *= -1;
        }
        double low = 0f;
        double high = number;
        boolean finished = false;
        int iters = 0;
        double guess = 1f;
        double squared;

        while (!finished) {
            guess = (low + high) / 2;
            iters ++;
            squared = guess * guess;
            if (Math.abs(number - squared) <= gTOLERANCE) {
                finished = true;
            } else if (squared > number) {
                high = guess;
            } else {
                low = guess;
            }
        }
        System.out.printf("Binary search: \t\tThe approximate square root of %f is %f%s - %d iterations\n",(isComplex) ? -1*number : number,guess,(isComplex) ? "i" : "",iters);
    }

    public static void heronsMethod(double number) {
        double guess = 1;
        boolean finished = false;
        int iter = 0;
        while (!finished) {
            if (Math.abs(guess*guess - number) <= gTOLERANCE) {
                finished = true;
            } else {
                guess = (guess + ( number/ guess ) ) / 2;
                iter ++;
            }
        }
        System.out.printf("Heron's method: \tThe approximate square root of %f is %f - %d iterations\n",number,guess,iter);
    }
}
