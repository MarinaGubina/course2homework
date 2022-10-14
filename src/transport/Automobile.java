package transport;

import java.time.LocalDate;
import java.time.LocalTime;

public class Automobile extends Car implements Competing{
    public enum TypeOfAutomobile{
        SEDAN("Седан"),
        HATCHBACK("Хетчбек"),
        COUPE("Купе"),
        UNIVERSAL("Универсал"),
        SUV("Внедорожник"),
        CROSSOVER("Кроссовер"),
        PICKUP("Пикап"),
        VAN("Фургон"),
        MINIVAN("Минивэн");

        private final String type;
        TypeOfAutomobile(String type) {
            this.type = type;
        }

        public String getType() {
            return type;
        }
    }
    private TypeOfAutomobile typeOfAutomobile;
    public Automobile(String brand, String model, double engineVolume,TypeOfAutomobile typeOfAutomobile) {

        super(brand, model, engineVolume);
        this.typeOfAutomobile = typeOfAutomobile;
    }

    public TypeOfAutomobile getTypeOfAutomobile() {
        return typeOfAutomobile;
    }

    public void setTypeOfAutomobile(TypeOfAutomobile typeOfAutomobile) {
        this.typeOfAutomobile = typeOfAutomobile;
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
            throw new RuntimeException("Автомобиль " + super.getBrand()+" "
                    + super.getModel()+" не прошел диагностику");
        }
        return true;
    }

    @Override
    public void pitStop() {
        System.out.println(" здесь был пит-стоп ");
    }

    @Override
    public double maxSpeed() {
        return 200;
    }

    @Override
    public LocalTime bestTime() {
        return LocalTime.of(0,12,4);
    }

    @Override
    public void printType() {
        if(typeOfAutomobile == null){
            System.out.println("Данных не достаточно");
        }
        else {
            System.out.println("Тип авто: " + typeOfAutomobile);
        }
    }

    @Override
    public boolean doService() {
        return false;
    }

    @Override
    public void repairCar() {

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
    public String toString() {
        return "Automobile - " + super.toString() ;
    }
}