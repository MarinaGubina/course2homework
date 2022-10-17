package transport;

import java.time.LocalTime;
import java.util.Random;

public class Bus extends Car implements Competing{
    public enum CapacityBus{
        ESPECIALLY_SMALL("до 10 мест"),
        SMALL("до 25 мест"),
        AVERAGE("40-50 мест"),
        LARGE("60-80 мест"),
        ESPECIALLY_LARGE("100-120 мест");

        private final String capacity;
        CapacityBus(String capacity) {
            this.capacity = capacity;
        }

        public String getCapacity() {
            return capacity;
        }
    }
    private CapacityBus capacityBus;
    public Bus(String brand,
               String model,
               double engineVolume,
               CapacityBus capacityBus) {
        super(brand, model, engineVolume);
        this.capacityBus = capacityBus;
    }

    public CapacityBus getCapacityBus() {
        return capacityBus;
    }

    public void setCapacityBus(CapacityBus capacityBus) {
        this.capacityBus = capacityBus;
    }

    @Override
    public void pitStop() {
        System.out.println(" здесь был пит-стоп ");
    }

    @Override
    public double maxSpeed() {
        return 120;
    }

    @Override
    public LocalTime bestTime() {
        return LocalTime.of(0,20,3);
    }

    @Override
    public void printType() {
        if(capacityBus == null){
            System.out.println("Данных не достаточно");
        }
        else {
            System.out.println("Вместимость автобуса: " + capacityBus +" : "+ capacityBus.getCapacity());
        }
    }

    @Override
    public void startMovement() {
        System.out.println("Начать движение");
    }

    @Override
    public void finishMovement() {
        System.out.println("Завершить движение");
    }

    @Override
    public boolean doDiagnostics() {
        System.out.println("Автобус " + super.getBrand() +
                super.getModel() + " не нуждается в диагностике");
        return true;
    }

    @Override
    public boolean doService() {
        return false;
    }

    @Override
    public void repairCar() {

    }

    @Override
    public String toString() {
        return "Bus - "+ super.toString();
    }
}