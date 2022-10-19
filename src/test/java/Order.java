import java.math.BigDecimal;

public class Order {
    //--------ATRIBUTES--------
   /*
   Integer a = null;
   int aa = 15;

   Long b = 15L;
   long bb =15L

   Float c = 15.67f;
   float cc = 15.67f

   Double d = 0.00;
   double dd = 0.00

    BigDecimal  bigDecimal = new BigDecimal( "13.46");

   String name = ""=; //null
   String text = "Some text here";
   Character e = '';
   char ee = '';

   Boolean f = true;
   Boolean g = false;
   boolean gg =

    */

    // ------------ATRIBUTES----------------
    private double totalPrice;
    private double weight;
    private double volume;
    private int itemCount;
    private double width;
    private double height;
    private double depth;
    private String address;
    private boolean dliveryRequested;

    // -------------GETTERS/SETTERS------------------------

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public int getItemCount() {
        return itemCount;
    }

    public void setItemCount(int itemCount) {
        this.itemCount = itemCount;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isDliveryRequested() {
        return dliveryRequested;
    }

    public void setDliveryRequested(boolean dliveryRequested) {
        this.dliveryRequested = dliveryRequested;
    }
}
