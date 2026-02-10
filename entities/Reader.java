package entities;

import java.util.Random;

public class Reader extends Sensor{

    public Reader(String sensorName, Double sensorValue) {
        super(sensorName, sensorValue);
    }

    //  Method that randomize the value readed
    public static Double sensorRead() {
        Random generatorRandom = new Random();
            
        Double valueRead = 10 + (100 - 10) * generatorRandom.nextDouble();
        return valueRead;
    }
}
