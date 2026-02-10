package entities;

public class Sensor {
    private String sensorName;
    private Double sensorValue;

    public Sensor(String sensorName, Double sensorValue) {
        this.sensorName = sensorName;
        this.sensorValue = sensorValue;
    }

    public String getSensorName() {
        return sensorName;
    }
    public void setSensorName(String sensorName) {
        this.sensorName = sensorName;
    }

    public Double getSensorValue() {
        return sensorValue;
    }
    public void setSensorValue(Double sensorValue) {
        this.sensorValue = sensorValue;
    }

    // Method that read the values and will output if its normal or not
    public void dataSecurityValidation() {
        System.out.printf("Sensor: %s | Actual value: %.2f %n" , getSensorName(), getSensorValue());
        
        if (getSensorValue() >= 20  && getSensorValue() <= 80) {
            System.out.println(">> NORMAL OPERATION <<");
        } else {
            System.out.println(">> OUT OF THE SECURITY LEVEL <<");
        }
    }
}
