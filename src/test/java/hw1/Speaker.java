package hw1;

public class Speaker {
    private int  frequencyResponse;
    private int THD;
    private int sensitivity;
    private int power;
    private String colour;

    public int getFrequencyResponse() {
        return frequencyResponse;
    }

    public void setFrequencyResponse(int frequencyResponse) {
        this.frequencyResponse = frequencyResponse;
    }

    public int getTHD() {
        return THD;
    }

    public void setTHD(int THD) {
        this.THD = THD;
    }

    public int getSensitivity() {
        return sensitivity;
    }

    public void setSensitivity(int sensitivity) {
        this.sensitivity = sensitivity;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
