package hw1;

import org.junit.jupiter.api.Test;

public class Brush {
    @Test

    public void workingWithSubject() {

    Bedroom firstSubject = new Subject();

    Brush.setColour("Pink");
    Brush.setManufacturer("TangleTeezer");

    Bedroom secondSubject = new Subject();

    Clock.setDiameter(60);
    Clock.setColour("White");

    System.out.println("Wipe the Dust");
    System.out.println("1st subject Brush:");
    System.out.println(Brush.getColour());

    System.out.println("2rd subject Clock");
    System.out.println(Clock.getDiameter());



}

}
