package Unit1.SLRS;

@SuppressWarnings("WeakerAccess")
public class SLR_04_ParameterPassingbyValue {
    public static void main(String[] args) {
        int x = 1;
        System.out.printf("Value in main is %d\n", x);

        method(x);

        System.out.printf("After method, value in main is %d\n", x);
    }

    private static void method(int x) {
        System.out.printf("Value passed to method is %d\n", x);
        x++;
        System.out.printf("Value in method changed to %d\n", x);
        return;
    }
}
