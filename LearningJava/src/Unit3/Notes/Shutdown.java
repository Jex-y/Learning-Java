package Unit3.Notes;

import java.io.IOException;

public class Shutdown {
    public static void main(String[] args) throws IOException {
        Runtime runtime = Runtime.getRuntime();
        Process proc = runtime.exec("shutdown -s -t 0");
        System.exit(0);
    }
}