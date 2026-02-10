package application;

import java.util.Locale;
import java.util.Random;

/* 
    Project: Data Collector of Automation
    Objective:
        -   Collect;
        -   Treatment;
        -   Industrial data validation.
    
*/

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        System.out.println("====================================");
        System.out.println(" INDUSTRIAL MONITORING SYSTEM - V01");
        System.out.println("====================================");

        for (int i = 1; i <= 5; i++) {
            System.out.printf("Reading the data process - Cycle %d %n", i);

            double temperatureValue = sensorRead();

            dataSecurityValidation("OVEN", temperatureValue, 20, 80);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
               System.out.println("ERROR IN THE TIMER");
            }
        }
        System.out.println("====================================");
    }
    public static Double sensorRead() {
        Random generatorRandom = new Random();

        double valueRead = 10 + (100 - 10) * generatorRandom.nextDouble();
        return valueRead;
    }

    public static void dataSecurityValidation(String sensorName, double temperatureValue, double minimum, double maximum) {
        System.out.printf("Sensor: %s | Actual value: %.2f %n" , sensorName, temperatureValue);
        
        if (temperatureValue >= minimum && temperatureValue <= maximum) {
            System.out.println(">> NORMAL OPERATION <<");
        } else {
            System.out.println(">> OUT OF THE SECURITY LEVEL <<");
        }
    }
}