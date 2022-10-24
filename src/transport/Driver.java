package transport;
import transport.Car;
import transport.Competing;

import java.util.Objects;

public abstract class Driver<T extends Car & Competing> {
    private String fullName;
    private String typeLicense;
    private int workExperience;
    private T car;

    public Driver(String fullName, String typeLicense, int workExperience, T car) {
        if(isNullOrEmpty(fullName)){
            this.fullName = "Заполните ФИО";
        }
        else{
            this.fullName = fullName;
        }
        if(isNullOrEmpty(typeLicense)){
            throw new RuntimeException("Не указан тип прав водителя :" + fullName);
        }
        else{
            this.typeLicense = typeLicense;
        }
        if(workExperience <= 0){
            this.workExperience = 0;
        }
        else {
            this.workExperience = workExperience;
        }
        this.car = car;
    }

    public boolean isNullOrEmpty(String val){
        return val == null || val.isEmpty() || val.isBlank();
    }
    public void startMovement(){
        System.out.println(fullName + " начинает движение на "+ car.toString());
    }
    public void endMovement(){
        System.out.println(fullName + " заканчивает движение на "+ car.toString());
    }
    public void refill(){
        System.out.println("Заправить транспортное средство" + car.toString());
    }

    public String getFullName() {
        return fullName;
    }

    public String getTypeLicense() {
        return typeLicense;
    }

    public int getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(int workExperience) {
        this.workExperience = workExperience;
    }

    public T getCar() {
        return car;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver<?> driver = (Driver<?>) o;
        return workExperience == driver.workExperience && fullName.equals(driver.fullName)
                && typeLicense.equals(driver.typeLicense) && car.equals(driver.car);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, typeLicense, workExperience, car);
    }

    @Override
    public String toString() {
        return  fullName +
                ", тип прав - "+ typeLicense+
                ", стаж: " + workExperience + " год,";
    }
}