public class Problem2 {
    public static void main(String[] args) {
        int last1 = 1;
        int last2 = 0;
        int buff = 1;
        int sum = 0;
        while (sum < 4e+6) {
            if (buff%2 == 0) {
                sum += buff;
            }
            last2 = last1;
            last1 = buff;
            buff = last1 + last2;
        }
        System.out.println(sum);
    }
}
