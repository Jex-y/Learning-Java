package Unit9.LampPackage;

public class LampMaker {
    public static void main(String[] args) {
        Lamp myLamp1 = new Lamp();
        Lamp myLamp2 = new Lamp();

        myLamp1.turn_on();
        myLamp2.turn_on();
        myLamp1.change_brightness(30);
        myLamp2.turn_off();

        System.out.println("Is myLamp1 on? " + myLamp1.is_on);
        System.out.println("myLamp1 brightness is " + myLamp1.brightness);
        System.out.println("Is myLamp2 on? " + myLamp2.is_on);

        System.out.println(myLamp1);
    }
}
