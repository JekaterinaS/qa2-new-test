package hw1;

import org.junit.jupiter.api.Test;

public class ObjectsHomework {

    @Test

    public void workingWithObjects () {
        Brush firstBrush = new Brush();

        firstBrush.setColour("Pink");
        firstBrush.setManufacturer("'Tangle Teezer'");

        Clock firstClock = new Clock();

        firstClock.setColour("Black");
        firstClock.setDiameter(60); 

        Door firstDoor = new Door();

        firstDoor.setColour("White");
        firstDoor.setMaterial("Wood");

        Dumbbells firstDumbbells = new Dumbbells();

        firstDumbbells.setQuantity(2);
        firstDumbbells.setColour("Pink");

        Mirror firstMirror = new Mirror();

        firstMirror.setDiameter(100);
        firstMirror.setFrameColour("Silver");

        MobilePhone firstMobilePhone = new MobilePhone();

        firstMobilePhone.setOperatingSystem("iOS");
        firstMobilePhone.setMemory(256);

        Pen firstPen = new Pen();

        firstPen.setBodyColour("Yellow");
        firstPen.setInkColour("Black");

        Speaker firstSpeaker = new Speaker();

        firstSpeaker.setColour("Black");
        firstSpeaker.setFrequencyResponse(20);

        Table firstTable = new Table();

        firstTable.setColour("White");
        firstTable.setLength(100);

        TableLamp firstTableLamp = new TableLamp();

        firstTableLamp.setColour("Blue");
        firstTableLamp.setWireLength(150);

        System.out.println("What things I have in my bedroom?");

        System.out.println("Brush:");
        System.out.println(firstBrush.getManufacturer());
        System.out.println(firstBrush.getColour());

        System.out.println("Clock:");
        System.out.println(firstClock.getColour());
        System.out.println(firstClock.getDiameter());

        System.out.println("Door:");
        System.out.println(firstDoor.getColour());
        System.out.println(firstDoor.getMaterial());

        System.out.println("Dumbbells:");
        System.out.println(firstDumbbells.getColour());
        System.out.println(firstDumbbells.getQuantity());

        System.out.println("Mirror:");
        System.out.println(firstMirror.getDiameter());
        System.out.println(firstMirror.getFrameColour());

        System.out.println("Mobile phone:");
        System.out.println(firstMobilePhone.getOperatingSystem());
        System.out.println(firstMobilePhone.getMemory());

        System.out.println("Pen:");
        System.out.println(firstPen.getBodyColour());
        System.out.println(firstPen.getInkColour());

        System.out.println("Speaker:");
        System.out.println(firstSpeaker.getColour());
        System.out.println(firstSpeaker.getFrequencyResponse());

        System.out.println("Table:");
        System.out.println(firstTable.getColour());
        System.out.println(firstTable.getLength());

        System.out.println("Table lamp:");
        System.out.println(firstTableLamp.getColour());
        System.out.println(firstTableLamp.getWireLength());

    }
}
