package hw2;

import hw2.Itinerary;
import hw2.Transport;
import org.junit.jupiter.api.Test;

public class TransportCalculationTest {

    @Test
    public void workingWithTransportTestCase() {

        Transport firstTransport = new Transport();

        firstTransport.setModeOfTransport("Сar");
        firstTransport.setFuelTankCapacity(62);
        firstTransport.setFuelConsumptionPer100Km(7);

        Transport secondTransport = new Transport();

        secondTransport.setModeOfTransport("Train");
        secondTransport.setFuelTankCapacity(7000);
        secondTransport.setFuelConsumptionPer100Km(160);

        Transport thirdTransport = new Transport();

        thirdTransport.setModeOfTransport("Airplane");
        thirdTransport.setFuelTankCapacity(30000);
        thirdTransport.setFuelConsumptionPer100Km(898);


        Itinerary firstItinerary = new Itinerary();

        firstItinerary.setStartPoint("Riga");
        firstItinerary.setDestinationPoint("Rezekne");
        firstItinerary.setDistance(242);

        Itinerary secondItinerary = new Itinerary();

        secondItinerary.setStartPoint("Riga");
        secondItinerary.setDestinationPoint("Moskow");
        secondItinerary.setDistance(924);

        Itinerary thirdItinerary = new Itinerary();

        thirdItinerary.setStartPoint("Riga");
        thirdItinerary.setDestinationPoint("Minsk");
        thirdItinerary.setDistance(471);

        System.out.println("First transport route: ");
        System.out.println(firstItinerary.getStartPoint());
        System.out.println(firstItinerary.getDestinationPoint());
        System.out.println(firstItinerary.getDistance());
        System.out.println("Fuel consumed: ");
        System.out.println((firstTransport.getFuelConsumptionPer100Km() * firstItinerary.getDistance()) / 100);

        if (firstTransport.getFuelConsumptionPer100Km() * firstItinerary.getDistance() / 100 <= firstTransport.getFuelTankCapacity())
        {
            System.out.println("The car will be able to drive the route on one fuel tank");
        } else{
            System.out.println("The car not be able to drive the route on one fuel tank");
        }

        System.out.println("First transport route: ");
        System.out.println(firstItinerary.getStartPoint());
        System.out.println(firstItinerary.getDestinationPoint());
        System.out.println(firstItinerary.getDistance());
        System.out.println("Fuel consumed: ");
        System.out.println((secondTransport.getFuelConsumptionPer100Km() * firstItinerary.getDistance()) / 100);

        if (secondTransport.getFuelConsumptionPer100Km() * firstItinerary.getDistance() / 100 <= secondTransport.getFuelTankCapacity())
        {
            System.out.println("The train will be able to drive the route on one fuel tank");
        } else{
            System.out.println("The train not be able to drive the route on one fuel tank");
        }

        System.out.println("First transport route: ");
        System.out.println(firstItinerary.getStartPoint());
        System.out.println(firstItinerary.getDestinationPoint());
        System.out.println(firstItinerary.getDistance());
        System.out.println("Fuel consumed: ");
        System.out.println((thirdTransport.getFuelConsumptionPer100Km() * firstItinerary.getDistance()) / 100);

        if (thirdTransport.getFuelConsumptionPer100Km() * firstItinerary.getDistance() / 100 <= thirdTransport.getFuelTankCapacity())
        {
            System.out.println("The airplane will be able to drive the route on one fuel tank");
        } else{
            System.out.println("The airplane not be able to drive the route on one fuel tank");
        }

        System.out.println("Second transport route: ");
        System.out.println(secondItinerary.getStartPoint());
        System.out.println(secondItinerary.getDestinationPoint());
        System.out.println(secondItinerary.getDistance());
        System.out.println("Fuel consumed: ");
        System.out.println((firstTransport.getFuelConsumptionPer100Km() * secondItinerary.getDistance()) / 100);

        if (firstTransport.getFuelConsumptionPer100Km() * secondItinerary.getDistance() / 100 <= firstTransport.getFuelTankCapacity())
        {
            System.out.println("The car will be able to drive the route on one fuel tank");
        } else{
            System.out.println("The car not be able to drive the route on one fuel tank");
        }

        System.out.println("Second transport route: ");
        System.out.println(secondItinerary.getStartPoint());
        System.out.println(secondItinerary.getDestinationPoint());
        System.out.println(secondItinerary.getDistance());
        System.out.println("Fuel consumed: ");
        System.out.println((secondTransport.getFuelConsumptionPer100Km() * secondItinerary.getDistance()) / 100);

        if (secondTransport.getFuelConsumptionPer100Km() * secondItinerary.getDistance() / 100 <= secondTransport.getFuelTankCapacity())
        {
            System.out.println("The train will be able to drive the route on one fuel tank");
        } else{
            System.out.println("The train not be able to drive the route on one fuel tank");
        }

        System.out.println("Second transport route: ");
        System.out.println(secondItinerary.getStartPoint());
        System.out.println(secondItinerary.getDestinationPoint());
        System.out.println(secondItinerary.getDistance());
        System.out.println("Fuel consumed: ");
        System.out.println((thirdTransport.getFuelConsumptionPer100Km() * secondItinerary.getDistance()) / 100);

        if (thirdTransport.getFuelConsumptionPer100Km() * secondItinerary.getDistance() / 100 <= thirdTransport.getFuelTankCapacity())
        {
            System.out.println("The airplane will be able to drive the route on one fuel tank");
        } else{
            System.out.println("The airplane not be able to drive the route on one fuel tank");
        }

        System.out.println("Third transport route: ");
        System.out.println(thirdItinerary.getStartPoint());
        System.out.println(thirdItinerary.getDestinationPoint());
        System.out.println(thirdItinerary.getDistance());
        System.out.println("Fuel consumed: ");
        System.out.println((firstTransport.getFuelConsumptionPer100Km() * thirdItinerary.getDistance()) / 100);

        if (firstTransport.getFuelConsumptionPer100Km() * thirdItinerary.getDistance() / 100 <= firstTransport.getFuelTankCapacity())
        {
            System.out.println("The car will be able to drive the route on one fuel tank");
        } else{
            System.out.println("The car not be able to drive the route on one fuel tank");
        }

        System.out.println("Third transport route: ");
        System.out.println(thirdItinerary.getStartPoint());
        System.out.println(thirdItinerary.getDestinationPoint());
        System.out.println(thirdItinerary.getDistance());
        System.out.println("Fuel consumed: ");
        System.out.println((secondTransport.getFuelConsumptionPer100Km() * thirdItinerary.getDistance()) / 100);

        if (secondTransport.getFuelConsumptionPer100Km() * thirdItinerary.getDistance() / 100 <= secondTransport.getFuelTankCapacity())
        {
            System.out.println("The train will be able to drive the route on one fuel tank");
        } else{
            System.out.println("The train not be able to drive the route on one fuel tank");
        }

        System.out.println("Third transport route: ");
        System.out.println(thirdItinerary.getStartPoint());
        System.out.println(thirdItinerary.getDestinationPoint());
        System.out.println(thirdItinerary.getDistance());
        System.out.println("Fuel consumed: ");
        System.out.println((thirdTransport.getFuelConsumptionPer100Km() * thirdItinerary.getDistance()) / 100);

        if (thirdTransport.getFuelConsumptionPer100Km() * thirdItinerary.getDistance() / 100 <= thirdTransport.getFuelTankCapacity())
        {
            System.out.println("The airplane will be able to drive the route on one fuel tank");
        } else{
            System.out.println("The airplane not be able to drive the route on one fuel tank");
        }
    }
}
