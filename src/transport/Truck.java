package transport;

import java.time.LocalDate;
import java.time.LocalTime;

public class Truck extends Car implements Competing{
    public enum CapacityTruck{
        N1("с полной массой до 3,5 тонн"),
        N2("с полной массой свыше 3,5 до 12 тонн"),
        N3("с полной массой свыше 12 тонн");

        private final String capacity;
        CapacityTruck(String capacity) {
            this.capacity = capacity;
        }

        public String getCapacity() {
            return capacity;
        }
    }
    private CapacityTruck capacityTruck;
    public Truck(String brand,
                 String model,
                 double engineVolume,
                 CapacityTruck capacityTruck) {
        super(brand, model, engineVolume);
        this.capacityTruck = capacityTruck;
    }

    public CapacityTruck getCapacityTruck() {
        return capacityTruck;
    }

    public void setCapacityTruck(CapacityTruck capacityTruck) {
        this.capacityTruck = capacityTruck;
    }

    @Override
    public void pitStop() {
        System.out.println(" здесь был пит-стоп ");
    }

    @Override
    public double maxSpeed() {
        return 140;
    }

    @Override
    public LocalTime bestTime() {
        return LocalTime.of(0,18,45);
    }

    @Override
    public void printType() {
        if(capacityTruck == null){
            System.out.println("Данных не достаточно");
        }
        else {
            System.out.println("Грузоподъемность: " + capacityTruck + " : " + capacityTruck.getCapacity());
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
        boolean season;
        if(LocalDate.now().getMonthValue() > 10  || LocalDate.now().getMonthValue() < 4){
            season = false; // winter
        }
        else{
            season = true; // summer
        }

        if(season != super.isSummerTyres()){
            throw new RuntimeException("Грузовик " + super.getBrand()+" "
                        + super.getModel()+" не прошел диагностику");
        }
        return true;
    }

    @Override
    public String toString() {
        return "Truck - "+ super.toString();
    }
}