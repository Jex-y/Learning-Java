package Unit9.LampPackage;

public class Lamp {
    boolean is_on;
    int brightness;

    public void turn_on() {
        is_on = true;
    }

    public void turn_off() {
        is_on = false;
    }

    public void change_brightness(int amount) {
        brightness += amount;
    }

    @Override
    public String toString() {
        String rep = "Lamp is ";
        if (is_on) {
            rep += "on";
        } else {
            rep += "off";
        }
        rep += ", brightness is " + brightness;

        return  rep;
    }
}
