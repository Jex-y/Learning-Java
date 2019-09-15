public class EnumsExample4 {
    enum Level {
        LOW,
        MEDIUM,
        HIGH
    }

        public static void main(String[] args) {
            for (Level myVar : Level.values()) {
                System.out.println(myVar);
            }
    }
}
