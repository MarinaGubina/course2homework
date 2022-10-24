package transport;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class Car {
    private String brand;
    private String model;
    private double engineVolume;
    private boolean summerTyres;

    private final Set<Sponsor> sponsors = new HashSet<>();
    private final Set<Mechanic<?>> mechanics = new HashSet<>();
    private final Set<Driver<?>> drivers = new HashSet<>();
    public Car(String brand, String model, double engineVolume) {
        if(isNullOrEmpty(brand)){
            this.brand = "default";}
        else{
            this.brand = brand;
        }
        if(isNullOrEmpty(model)){
            this.model = "default";}
        else{
            this.model = model;
        }
        if(engineVolume <= 0){
            this.engineVolume = 1.6;}
        else{
            this.engineVolume = engineVolume;}
        this.summerTyres = true;
    }

    public void addMechanic(Mechanic<?> mechanic){
        mechanics.add(mechanic);
    }

    public void addSponsor(Sponsor sponsor){
        sponsors.add(sponsor);
    }
    public void addDriver(Driver driver){
        drivers.add(driver);
    }

    public Set<Sponsor> getSponsors() {

        return sponsors;
    }

    public Set<Mechanic<?>> getMechanics() {
        return mechanics;
    }

    public Set<Driver<?>> getDrivers() {
        return drivers;
    }

    public abstract boolean doService();
    public abstract void repairCar();
    public abstract boolean doDiagnostics();
    public abstract void printType();

    public abstract void startMovement();
    public abstract void finishMovement();

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if(engineVolume > 0 ){
            this.engineVolume = engineVolume;}
    }


    public boolean isSummerTyres() {
        return summerTyres;
    }

    public static boolean isNullOrEmpty(String val){
        return val == null || val.isEmpty() || val.isBlank();
    }
    public void changeTyres(){
        summerTyres = !summerTyres;
    }
    @Override
    public String toString() {
        return  "Марка ='" + brand + '\'' +
                ", модель ='" + model + '\'' +
                ", объем двигателя =" + engineVolume +
                " тип резины: " + (summerTyres? "летняя":"зимняя");
    }
}