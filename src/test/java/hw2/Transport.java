package hw2;

public class Transport {

    private String modeOfTransport;
    private double fuelTankCapacity;
    private double fuelConsumptionPer100Km;

    public String getModeOfTransport() {
        return modeOfTransport;
    }

    public void setModeOfTransport(String modeOfTransport) {
        this.modeOfTransport = modeOfTransport;
    }

    public double getFuelTankCapacity() {
        return fuelTankCapacity;
    }

    public void setFuelTankCapacity(double fuelTankCapacity) {
        this.fuelTankCapacity = fuelTankCapacity;
    }

    public double getFuelConsumptionPer100Km() {
        return fuelConsumptionPer100Km;
    }

    public void setFuelConsumptionPer100Km(double fuelConsumptionPer100Km) {
        this.fuelConsumptionPer100Km = fuelConsumptionPer100Km;
    }
}

