import hw1.Mirror;
import org.junit.jupiter.api.Test;

public class ObjectsPractice {
       @Test
       public void workingWithOrders () {
       Order firstOrder = new Order();

       firstOrder.setTotalPrice(12.34);
       firstOrder.setAddress("Rigas str. 22");
       firstOrder.setItemCount(9);

       Order secondOrder = new Order();

       secondOrder.setTotalPrice(55.67);
       secondOrder.setAddress("Lubanas str. 43-13");
       secondOrder.setItemCount(3);

       System.out.println("Hello,world!");
       // sout enter или tab, автоматом подставит System.out.printLn
       // System - объект который работает с текущей операционной системой
       System.out.println("1st order:");
       System.out.println(firstOrder.getTotalPrice());

       System.out.println("2st order:");
       System.out.println(secondOrder.getTotalPrice());
    }

}
