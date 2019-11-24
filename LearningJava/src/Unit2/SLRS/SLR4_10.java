package Unit2.SLRS;

        import java.text.DecimalFormat;
        import java.util.Dictionary;
        import java.util.Enumeration;
        import java.util.Hashtable;
        import java.util.Scanner;

public class SLR4_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Dictionary capitals = new Hashtable();
        capitals.put("England","London");
        capitals.put("France","Paris");
        capitals.put("Germany","Berlin");
        capitals.put("USA","Washington DC");
        capitals.put("Canada","Ottawa");

        String country; String capital;
        for (int i = 0; i < 2; i++) {
            System.out.println("Enter a new country:");
            country = input.nextLine();
            System.out.println("Enter the country's capital:");
            capital = input.nextLine();
            if (inDict(capitals,country)){
                System.err.println("Error: Country already in dictionary");
            } else {
                capitals.put(country,capital);
            }
        }
//-------------------------------------------------------------------------------------------------------------
        System.out.println("Enter a country to look up:");
        country = input.nextLine();
        if (inDict(capitals,country)) {
            System.out.printf("The capital of %s is %s\n",country,capitals.get(country));
        } else {
            System.err.println("Error: Country is not in dictionary");
        }
//-------------------------------------------------------------------------------------------------------------
        System.out.println("All countries and their capitals:");
        for (Enumeration keys = capitals.keys(); keys.hasMoreElements();) {
            country = (String) keys.nextElement();
            System.out.printf("The capital of %s is %s\n",country,capitals.get(country));
        }
//-------------------------------------------------------------------------------------------------------------
        System.out.println("Enter a country to remove:");
        country = input.nextLine();
        capitals.remove(country);
    }

    static boolean inDict(Dictionary dict, String key){
        boolean result = false;
        for (Enumeration keys = dict.keys(); keys.hasMoreElements();) {
            if (key.equals(keys.nextElement())) {
                result = true;
                break;
            }
        }
        return result;
    }
}
